package ru.cobalt42.ktMain.model.commonDocument.equipmentInstallationOnFoundationAct

import org.springframework.data.mongodb.core.mapping.Field

data class Verdict(
    @Field("id")
    var id: Int = 0,
    var rus: String = "",
    var eng: String = ""
)
