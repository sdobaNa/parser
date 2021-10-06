package ru.cobalt42.ktMain.model.commonDocument.mechanismTestAct

data class Mechanism(
    val number: String = "",
    val testDuration: String = "",
    val testConclusion: Boolean = false,
    val equipmentUid: String = ""
)
