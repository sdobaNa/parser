package ru.cobalt42.ktMain.model.commonDocument

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import ru.cobalt42.ktMain.model.commonDocument.hiddenWorkAct.CompositeLink
import ru.cobalt42.ktMain.model.commonDocument.hiddenWorkAct.Signers
import ru.cobalt42.ktMain.model.dictionary.Target
import ru.cobalt42.ktMain.model.dictionary.WorkType

data class ResponsibleStructureAct(
    var uid: String = "",
    val name: String = "",
    val date: String = "",
    val axes: String = "",
    val signers: Signers = Signers(), // from hiddenWorkAct
    val hiddenWorkActUids: List<String> = emptyList(),
    val drawings: List<CompositeLink> = emptyList(),
    val executiveSchemeUids: List<String> = emptyList(),
    val permitNextWorkType: WorkType = WorkType(),
    val additionalInformation: String = "",
    val target: Target = Target(),
    val nextTarget: Target = Target(),
    val isNextTargetSame: Boolean = false,
    val nextTargetAxis: String = "",
    val workConclusions: List<String> = emptyList(),
    val comment: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)