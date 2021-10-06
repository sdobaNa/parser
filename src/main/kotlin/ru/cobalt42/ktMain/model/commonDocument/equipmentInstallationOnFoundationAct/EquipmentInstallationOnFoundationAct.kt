package ru.cobalt42.ktMain.model.commonDocument.equipmentInstallationOnFoundationAct

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.cobalt42.ktMain.model.dictionary.Target

@Document
data class EquipmentInstallationOnFoundationAct(
    var uid: String? = "",
    val name: String = "",
    val date: String = "",
    val target: Target = Target(),
    val equipments: List<EquipmentTest> = emptyList(),
    val signers: Signers = Signers(),
    val comment: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)
