package ru.cobalt42.ktMain.model.tube.jointTubeLinePart

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.cobalt42.ktMain.model.dictionary.*
import ru.cobalt42.ktMain.model.dictionary.type.Type
import ru.cobalt42.ktMain.model.tube.tubeLinePart.Parameters

@Document
data class JointTubeLinePart(
    var uid: String = "",
    var name: String = "",
    var tubeLineUid: String = "",
    var beginPartUid: String = "",
    var beginPartParameters: Parameters = Parameters(),
    var endPartUid: String = "",
    var endPartParameters: Parameters = Parameters(),
    var weldType: WeldType = WeldType(),
    var weldingMaterialGroup: WeldingMaterialGroup = WeldingMaterialGroup(),
    var jointType: JointType = JointType(),
    var techDevDangerGroup: TechDevDangerGroup = TechDevDangerGroup(),
    var jointKit: List<JointKit> = mutableListOf(),
    var initialJoint: Boolean = false,
    var finalJoint: Boolean = false,
    var finishOther: String = "",
    var distanceFromPrevious: String = "",
    var kind: Kind = Kind(),
    var spool: String = "",
    var temperature: String = "",
    var jobHeight: String = "",
    var endPartLength: String = "",
    var originType: IdName = IdName(),
    var finishType: IdName = IdName(),
    var originOther: String = "",
    var geolocation: Geolocation = Geolocation(),
    var weldingConsumable: List<String> = mutableListOf(),
    var description: String = "",
    var reroute: String = "",
    var date: String = "",
    var connectionType: ConnectionType = ConnectionType(),
    var tensionForce: String = "",
    var boltMasterUid: String = "",
    var kilometerInPicket: String = "",
    var extraMark: String = "",
    var welderMasterUid: String = "",
    var condition: Type = Type(),
    var changeConditionDate: String = "",
    var commodities: List<CommodityEntry> = mutableListOf(),
    var welderCheck: Boolean = false,
    var wallThickness: String = "",
    var diameter: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)