package ru.cobalt42.ktMain.model.tubeDocument.tubeDocumentPack.documents

import ru.cobalt42.ktMain.model.common.project.PrintForm
import ru.cobalt42.ktMain.model.dictionary.IdName

data class BasicTestAct(
    var uid: String = "",
    var name: String = "",
    var date: String = "",
    var construct: Signer = Signer(),
    var technicalSupervision: Signer = Signer(),
    var planner: Signer = Signer(),
    var testPressureDuration: String = "",
    var testType: List<IdName> = emptyList(),
    var testMethod: IdName = IdName(),
    var required: Boolean = false,
    var printForm: PrintForm = PrintForm(),
    var refresh: Boolean = false,
    var label: String = ""
)
