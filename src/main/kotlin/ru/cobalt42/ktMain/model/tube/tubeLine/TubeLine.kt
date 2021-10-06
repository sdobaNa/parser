package ru.cobalt42.ktMain.model.tube.tubeLine

import com.fasterxml.jackson.annotation.JsonIgnore
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class TubeLine(
    var uid: String = "",
    val name: String = "",
    val constructionUid: String = "",
    val tubeLineUid: String = "",
    val drawings: List<String> = emptyList(),
    val comment: String = "",
    val previousTubeLine: PreviousTubeLine = PreviousTubeLine(),
    val nextTubeLine: NextTubeLine = NextTubeLine(),
    val fluidCode: String = "",
    val fluidNameRU: String = "",
    val fluidNameEN: String = "",
    val fluidGroupGOST: FluidGroupGOST = FluidGroupGOST(),
    val fluidGroupTCU: String = "",
    val tubeLineCategoryGOST: TubeLineCategoryGOST = TubeLineCategoryGOST(),
    val tubeLineCategoryTCU: String = "",
    val designConditionPressure: DesignConditionPressure = DesignConditionPressure(),
    val designConditionTemperature: DesignConditionTemperature = DesignConditionTemperature(),
    val regulatoryDocument: RegulatoryDocument = RegulatoryDocument(),
    val testPressurePneumatic: String = "",
    val testPressureLiquid: String = "",
    val pipingSpec: String = "",
    val radiographicTestPercent: String = "",
    val ultrasonicTestPercent: String = "",
    val colorFlawDetectionTestPercent: String = "",
    val steeloscopyTestPercent: String = "",
    val blowdownPressure: String = "",
    val flushingPressure: String = "",
    val required: Required = Required(),
    val jointClass: JointClass = JointClass(),
    val cleaningInstrument: String = "",
    val cleaningInstrumentQuantity: String = "",
    val environment: String = "",
    val type: Type = Type(),
    val cleanType: CleanType = CleanType(),
    val length: String = "",
    @Id
    @JsonIgnore
    var _id: ObjectId = ObjectId.get()
)
