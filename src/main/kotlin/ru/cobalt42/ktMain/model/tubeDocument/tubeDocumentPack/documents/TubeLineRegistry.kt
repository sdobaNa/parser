package ru.cobalt42.ktMain.model.tubeDocument.tubeDocumentPack.documents

import ru.cobalt42.ktMain.model.common.project.PrintForm
import ru.cobalt42.ktMain.model.dictionary.Target

data class TubeLineRegistry(
    var uid: String = "",
    var date: String = "",
    var name: String = "",
    var target: Target = Target(),
    var issuer: Signer = Signer(),
    var accepter: Signer = Signer(),
    var customer: Signer = Signer(),
    var mainConstruct: Signer = Signer(),
    var construct: Signer = Signer(),
    var testers: List<Signer> = listOf(),
    var required: Boolean = false,
    var printForm: PrintForm = PrintForm(),
    var refresh: Boolean = false,
    var label: String = ""
)
