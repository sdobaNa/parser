package ru.cobalt42.ktMain.model.tubeDocument.tubeDocumentPack.documents

import ru.cobalt42.ktMain.model.common.project.PrintForm
import ru.cobalt42.ktMain.model.dictionary.Target

data class TubeCavityCleaningAct(
    var uid: String = "",
    var name: String = "",
    var date: String = "",
    var target: Target = Target(),
    var commissionChairman: Signer = Signer(),
    var commissionMembers: List<Signer> = emptyList(),
    var required: Boolean = false,
    var printForm: PrintForm = PrintForm(),
    var refresh: Boolean = false,
    var label: String = ""
)
