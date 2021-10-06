package ru.cobalt42.ktMain.model.commonDocument.hiddenWorkAct

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.cobalt42.ktMain.model.dictionary.*
import ru.cobalt42.ktMain.model.dictionary.Target

@Document
data class HiddenWorkAct(
    var uid: String? = "",
    val name: String = "",
    val workType: WorkType,
    val date: String = "",
    val axes: String = "",
    val signers: Signers = Signers(),
    val works: List<String> = emptyList(),
    val drawings: List<CompositeLink> = emptyList(),
    val executiveSchemeUids: List<String> = emptyList(),
    val permitNextWorkType: WorkType = WorkType(),
    val additionalInformation: String = "",
    val target: Target = Target(),
    val nextTarget: Target = Target(),
    val isNextTargetSame: Boolean = false,
    val nextTargetAxis: String = "",
    val workScope: String = "",
    val workConclusions: List<String> = emptyList(),
    val comment: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)
