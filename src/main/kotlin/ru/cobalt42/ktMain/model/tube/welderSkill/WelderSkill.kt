package ru.cobalt42.ktMain.model.tube.welderSkill

import com.fasterxml.jackson.annotation.JsonIgnore
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.cobalt42.ktMain.model.dictionary.*

@Document
data class WelderSkill(
    var uid: String = "",
    var name: String = "",
    var personUid: String = "",
    val naksUid: String = "",
    var welderAdmissionSheetUid: String = "",
    var weldingMethod: MutableList<WeldingMethod> = mutableListOf(),
    var weldedPartsType: MutableList<WeldedPartsType> = mutableListOf(),
    var weldType: MutableList<WeldType> = mutableListOf(),
    var weldingMaterialGroup: MutableList<WeldingMaterialGroup> = mutableListOf(),
    var weldingMaterial: MutableList<WeldingMaterial> = mutableListOf(),
    var weldedPartThickness: Range = Range(),
    var weldedPartDiameter: Range = Range(),
    var weldingPosition: MutableList<WeldingPosition> = mutableListOf(),
    var jointType: MutableList<JointType> = mutableListOf(),
    var techDevDangerGroup: MutableList<TechDevDangerGroup> = mutableListOf(),
    @Id
    @JsonIgnore
    var _id: ObjectId = ObjectId.get()
)
