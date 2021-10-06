package ru.cobalt42.ktMain.model.common.project

data class DocumentParameters(
    val label: String = "",
    val required: Boolean = false,
    val printForm: PrintForm = PrintForm()
)
