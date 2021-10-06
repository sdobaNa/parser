package ru.cobalt42.ktMain.model.tubeDocument.tubeDocumentPack.documents

import ru.cobalt42.ktMain.model.common.project.PrintForm
import ru.cobalt42.ktMain.model.dictionary.Target

data class TubeLineSpecification(
    var uid: String = "",
    var date: String = "",
    var target: Target = Target(),
    var construct: Signer = Signer(),
    var required: Boolean = false,
    var printForm: PrintForm = PrintForm(),
    var refresh: Boolean = false,
    var label: String = "",
    var name: String = ""
)
