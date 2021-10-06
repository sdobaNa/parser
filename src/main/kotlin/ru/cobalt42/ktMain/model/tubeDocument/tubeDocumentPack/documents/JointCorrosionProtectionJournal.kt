package ru.cobalt42.ktMain.model.tubeDocument.tubeDocumentPack.documents

import ru.cobalt42.ktMain.model.common.project.PrintForm

data class JointCorrosionProtectionJournal(
    var uid: String = "",
    var name: String = "",
    var construct: Signer = Signer(),
    var planner: Signer = Signer(),
    var developer: Signer = Signer(),
    var construction: Signer = Signer(),
    var mainWorker: Signer = Signer(),
    var control: Signer = Signer(),
    var required: Boolean = false,
    var printForm: PrintForm = PrintForm(),
    var refresh: Boolean = false,
    var label: String = "",
    var date: String = ""
)
