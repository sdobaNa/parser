package ru.cobalt42.ktMain.model.common.work

import ru.cobalt42.ktMain.model.commonDocument.equipmentDefectsAct.Type

data class WorkScope(
    val value: String = "",
    val unit: Type = Type()
)
