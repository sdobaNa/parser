package ru.cobalt42.ktMain.model.tubeDocument.tubeDocumentPack.documents

import ru.cobalt42.ktMain.model.common.project.PrintForm
import ru.cobalt42.ktMain.model.dictionary.Target

data class WeldingJournalMembersOne(
    var uid: String = "",
    var name: String = "",
    var date: String = "",
    var customer: Signer = Signer(),
    var mainConstruct: Signer = Signer(),
    var construct: Signer = Signer(),
    var chiefWeldingLab: Signer = Signer(),
    var target: Target = Target(),
    var required: Boolean = false,
    var printForm: PrintForm = PrintForm(),
    var refresh: Boolean = false,
    var label: String = ""
)
