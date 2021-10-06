package ru.cobalt42.ktMain.model.tubeDocument.tubeDocumentPack.documents

import ru.cobalt42.ktMain.model.common.project.PrintForm

data class TubeLineIsolationPermit(
    var uid: String = "",
    var label: String = "",
    var name: String = "",
    var date: String = "",
    var mainConstruct: Signer = Signer(),
    var labChief: Signer = Signer(),
    var customer: Signer = Signer(),
    var construct: Signer = Signer(),
    val isTested: Boolean = false,
    var required: Boolean = false,
    var printForm: PrintForm = PrintForm(),
    var refresh: Boolean = false,
)
