package ru.cobalt42.ktMain.model.commonDocument.equipmentDefectsAct

import org.springframework.data.mongodb.core.mapping.*

data class Type(
    @Field("id")
    val id: Int = 0,
    val label: Label = Label()
)
