package ru.cobalt42.ktMain.model.commonDocument.equipmentAfterIndividualTestAct

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.cobalt42.ktMain.model.dictionary.Target

@Document
data class EquipmentAfterIndividualTestAct(
    var uid: String? = "",
    val name: String = "",
    val date: String = "",
    val target: Target = Target(),
    val equipmentUids: List<String> = emptyList(),
    val drawingUids: List<String> = emptyList(),
    val extraTests: String = "",
    val equipmentComplexTestDate: String = "",
    val installationWorkBeginDate: String = "",
    val installationWorkEndDate: String = "",
    val signers: Signers = Signers(),
    val comment: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)