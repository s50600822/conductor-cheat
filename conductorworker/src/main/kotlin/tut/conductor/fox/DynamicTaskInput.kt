package tut.conductor.fox

data class DynamicTaskInput(
    val asset: Asset,
    val tracer: String,
    val transfer_priority: Int
)