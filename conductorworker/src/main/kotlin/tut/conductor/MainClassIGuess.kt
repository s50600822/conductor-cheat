package tut.conductor

import com.netflix.conductor.client.http.TaskClient
import com.netflix.conductor.client.task.WorkflowTaskCoordinator
import com.netflix.conductor.client.worker.Worker
import com.netflix.conductor.common.metadata.tasks.Task
import com.netflix.conductor.common.metadata.tasks.TaskResult
import com.netflix.conductor.common.metadata.tasks.TaskResult.Status
import tut.conductor.fox.*
import java.lang.System.out
import java.lang.Thread.sleep


fun main(args: Array<String>) {
    val taskClient = TaskClient()
    taskClient.setRootURI("http://localhost:8080/api/")
    val threadCount = 2
    val builder = WorkflowTaskCoordinator.Builder()
    val coordinator = builder
            .withWorkers(
                SampleWorker("verify_if_idents_are_added"),
                SampleWorker("add_idents"),
                SampleWorker("bullshit"),
                GetPlayList(), AlreadyFiltering(), ExpandFilter(), GetPlayList(), TransferAndWait(), TransferPrepForkTask()
            )
            .withThreadCount(threadCount).withTaskClient(taskClient).build()

    //Start for polling and execution of the tasks
    coordinator.init()
}

class SampleWorker(val name: String) : Worker {
    override fun getTaskDefName(): String {
        return name
    }

    override fun execute(task: Task): TaskResult {
        out.printf("Executing %s%n", taskDefName)
        out.printf("\nSLEEP\n")
        sleep(30000)
        val result = TaskResult(task)

        result.status = Status.COMPLETED
        result.outputData["outputKey1"] = "value"
        result.outputData["oddEven"] = 1
        result.outputData["mod"] = 4
        out.printf("\n       DONE\n")
        return result
    }

}