package tut.conductor.meta.payload

data class Task(
    val name: String,
    val taskReferenceName: String,
    val inputParameters: Map<String, String>,
    val type: String
)