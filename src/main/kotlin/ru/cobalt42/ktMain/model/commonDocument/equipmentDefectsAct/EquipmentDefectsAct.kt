package ru.cobalt42.ktMain.model.commonDocument.equipmentDefectsAct

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.cobalt42.ktMain.model.dictionary.Target

@Document
data class EquipmentDefectsAct(
    var uid: String? = "",
    val name: String = "",
    val date: String = "",
    val passingEquipmentToInstallationActUid: String = "",
    val target: Target = Target(),
    val workType: Type = Type(),
    val equipments: List<EquipmentDefect> = emptyList(),
    val defectsRemovalEvents: String = "",
    val signers: Signers = Signers(),
    val comment: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)
