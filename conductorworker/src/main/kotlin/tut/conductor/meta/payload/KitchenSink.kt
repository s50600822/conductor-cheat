package tut.conductor.meta.payload

data class WorkflowDef(
    val name: String,
    val description: String,
    val version: Int,
    val tasks: List<Task>
)