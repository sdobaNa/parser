package ru.cobalt42.ktMain.model.tubeDocument.tubeDocumentPack.documents

import ru.cobalt42.ktMain.model.common.project.PrintForm

data class CorrosionWorksJournal(
    var uid: String = "",
    var workProducer: Signer = Signer(),
    var mainWorker: Signer = Signer(),
    var required: Boolean = false,
    var printForm: PrintForm = PrintForm(),
    var refresh: Boolean = false,
    var label: String = "",
    var name: String = "",
    var date: String = ""
)
