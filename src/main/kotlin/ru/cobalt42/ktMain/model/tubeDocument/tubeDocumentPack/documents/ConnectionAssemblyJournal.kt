package ru.cobalt42.ktMain.model.tubeDocument.tubeDocumentPack.documents

import ru.cobalt42.ktMain.model.common.project.PrintForm

data class ConnectionAssemblyJournal(
    var uid: String = "",
    var date: String = "",
    var name: String = "",
    var construct: Signer = Signer(),
    var required: Boolean = false,
    var printForm: PrintForm = PrintForm(),
    var refresh: Boolean = false,
    var label: String = ""
)
