package ru.cobalt42.ktMain.model.commonDocument.equipmentInstallationOnFoundationAct

data class EquipmentTest(
    val equipmentUid: String = "",
    val number: String = "",
    val verdict: Verdict = Verdict(),
    val isPouring: Boolean = false
)
