package ru.cobalt42.ktMain.model.commonDocument.vesselApparatusTestAct

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.cobalt42.ktMain.model.commonDocument.equipmentDefectsAct.Type
import ru.cobalt42.ktMain.model.dictionary.Target

@Document
data class VesselApparatusTestAct(
    var uid: String? = "",
    val name: String = "",
    val date: String = "",
    val target: Target = Target(),
    val inspectionTypes: List<Type> = emptyList(),
    val testType: Type = Type(),
    val trialPressureCase: String = "",
    val trialPressureTubePart: String = "",
    val trialPressureCasing: String = "",
    val equipmentUid: String = "",
    val number: String = "",
    val trialPressureDuration: String = "",
    val workPressureDuration: String = "",
    val inspectionResult: String = "",
    val workPressureCase: String = "",
    val workPressureTubePart: String = "",
    val workPressureCasing: String = "",
    val signers: Signers = Signers(),
    val comment: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)
