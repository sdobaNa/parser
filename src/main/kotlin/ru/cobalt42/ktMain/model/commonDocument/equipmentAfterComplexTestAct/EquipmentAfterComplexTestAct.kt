package ru.cobalt42.ktMain.model.commonDocument.equipmentAfterComplexTestAct

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.cobalt42.ktMain.model.commonDocument.equipmentAfterIndividualTestAct.Signers
import ru.cobalt42.ktMain.model.commonDocument.equipmentDefectsAct.Type
import ru.cobalt42.ktMain.model.dictionary.Target

@Document
data class EquipmentAfterComplexTestAct(
    var uid: String? = "",
    val name: String = "",
    val date: String = "",
    val target: Target = Target(),
    val equipmentUids: List<String> = emptyList(),
    val adjustmentWorkBeginDate: String = "",
    val adjustmentWorkEndDate: String = "",
    val adjustmentWorkDuration: String = "",
    val adjustmentWorkDurationType: Type = Type(),
    val technologicalCardUid: String = "",
    val adjustmentOrganizationUid: String = "",
    val annexNumberWithDefects: String = "",
    val annexNumberWithExtraWorks: String = "",
    val adjustmentDate: String = "",
    val signers: Signers = Signers(),
    val comment: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)