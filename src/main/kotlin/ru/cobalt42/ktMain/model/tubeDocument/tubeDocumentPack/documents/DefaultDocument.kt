package ru.cobalt42.ktMain.model.tubeDocument.tubeDocumentPack.documents

import ru.cobalt42.ktMain.model.common.project.PrintForm

data class DefaultDocument(
    var uid: String = "",
    var name: String = "",
    var label: String = "",
    var required: Boolean = false,
    var refresh: Boolean = false,
    var printForm: PrintForm = PrintForm(),
    var date: String = ""
)
