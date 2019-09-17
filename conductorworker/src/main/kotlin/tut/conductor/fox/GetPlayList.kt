package tut.conductor.fox

import com.netflix.conductor.client.worker.Worker
import com.netflix.conductor.common.metadata.tasks.Task
import com.netflix.conductor.common.metadata.tasks.TaskResult
import com.netflix.conductor.common.metadata.tasks.TaskResult.Status.COMPLETED
import java.lang.Thread.sleep

class GetPlayList : Worker {
    override fun getTaskDefName(): String {
        return "get_playlist_task_v1"
    }

    override fun execute(task: Task): TaskResult {
        System.out.printf("Executing %s%n\n", taskDefName)
        System.out.println("SLEEP")
        sleep(3000)
        val result = TaskResult(task)
        result.status = COMPLETED
        result.outputData["tracer"] = "airflow-trace0001"
        result.outputData["playlistURIs"] = listofAsset()
        System.out.println("DONE")
        return result
    }

    fun listofAsset() = listOf(
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20League;date=2019-09-16",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20Footy;date=2019-09-16",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20Sports%20506;date=2019-09-16",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20Sports%20505;date=2019-09-16",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20Sports%20503;date=2019-09-16",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Evergreen%202;date=2019-09-16",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20Cricket;date=2019-09-16",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Evergreen%201;date=2019-09-16",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20Sports%20MORE;date=2019-09-16",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20League;date=2019-09-17",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20Footy;date=2019-09-17",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20Sports%20506;date=2019-09-17",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20Sports%20505;date=2019-09-17",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20Sports%20503;date=2019-09-17",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Evergreen%202;date=2019-09-17",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20Cricket;date=2019-09-17",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Evergreen%201;date=2019-09-17",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20Sports%20MORE;date=2019-09-17",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20League;date=2019-09-18",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20Footy;date=2019-09-18",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20Sports%20506;date=2019-09-18",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20Sports%20505;date=2019-09-18",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20Sports%20503;date=2019-09-18",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Evergreen%202;date=2019-09-18",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20Cricket;date=2019-09-18",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Evergreen%201;date=2019-09-18",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20Sports%20MORE;date=2019-09-18",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20League;date=2019-09-19",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20Footy;date=2019-09-19",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20Sports%20506;date=2019-09-19",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20Sports%20505;date=2019-09-19",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20Sports%20503;date=2019-09-19",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Evergreen%202;date=2019-09-19",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20Cricket;date=2019-09-19",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Evergreen%201;date=2019-09-19",
        "http://playlist-service.microservices:8151/playlist-service/playlists/;channelName=Fox%20Sports%20MORE;date=2019-09-19")
}