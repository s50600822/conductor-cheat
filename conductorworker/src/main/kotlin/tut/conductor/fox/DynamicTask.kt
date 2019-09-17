package tut.conductor.fox

data class DynamicTask(
    val name: String,
    val optional: Boolean,
    val responseTimeoutSeconds: Int,
    val retryCount: Int,
    val retryDelaySeconds: Int,
    val retryLogic: String,
    val taskReferenceName: String,
    val timeoutPolicy: String,
    val timeoutSeconds: Int,
    val type: String
)