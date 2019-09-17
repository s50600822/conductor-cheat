package tut.conductor.fox

import com.netflix.conductor.client.worker.Worker
import com.netflix.conductor.common.metadata.tasks.Task
import com.netflix.conductor.common.metadata.tasks.TaskResult
import java.util.*

class TransferAndWait : Worker {
    override fun getTaskDefName(): String {
        return "transfer_and_wait_task_v1"
    }

    override fun execute(task: Task): TaskResult {
        System.out.printf("Executing %s%n\n", taskDefName)
        System.out.println("SLEEP")
        Thread.sleep(3000)
        val result = TaskResult(task)
        result.status = TaskResult.Status.COMPLETED
        result.outputData["tracer"] = "airflow-trace0001"
        result.outputData["transfer_status"] = mapOf(
            "transferId" to UUID.randomUUID().toString(),
            "status" to "ASSET_FAILED_VALIDATION",
            "mamSystem" to "NA",
            "transferLocationResults" to
                    listOf(
                        mapOf(
                            "location" to "playout-dr",
                            "filename" to "P273829C.mxf",
                            "mamTransferId" to "null",
                            "mamStatus" to null
                        )
                    )
        )
        System.out.println("DONE")
        return result
    }
}