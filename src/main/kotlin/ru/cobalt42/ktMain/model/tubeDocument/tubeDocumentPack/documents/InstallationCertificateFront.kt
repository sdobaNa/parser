package ru.cobalt42.ktMain.model.tubeDocument.tubeDocumentPack.documents

import ru.cobalt42.ktMain.model.common.project.PrintForm

data class InstallationCertificateFront(
    var uid: String = "",
    var label: String = "",
    var name: String = "",
    var date: String = "",
    var construct: Signer = Signer(),
    var planner: Signer = Signer(),
    var required: Boolean = false,
    var printForm: PrintForm = PrintForm(),
    var refresh: Boolean = false
)
