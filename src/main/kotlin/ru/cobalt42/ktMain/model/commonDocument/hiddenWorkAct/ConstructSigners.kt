package ru.cobalt42.ktMain.model.commonDocument.hiddenWorkAct

data class ConstructSigners(
    val organizationUid: String = "",
    val agentOrgUid: String = "",
    val personUid: String = "",
    val controlPersonUid: String = "",
    val surveyPersonUid: String = ""
)