package ru.cobalt42.ktMain.model.common.work

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.cobalt42.ktMain.model.dictionary.*
import ru.cobalt42.ktMain.model.dictionary.Target
import ru.cobalt42.ktMain.model.dictionary.type.Type

@Document
data class Work(
    var name: String = "",
    var uid: String = "",
    var target: Target = Target(),
    var type: WorkType = WorkType(),
    var startDate: String = "",
    var expirationDate: String = "",
    var axes: String = "",
    var commodities: List<CommodityEntry> = emptyList(),
    var comment: String = "",
    var layer: String = "",
    var layerThickness: String = "",
    var surfaceTemperature: String = "",
    var ambientTemperature: String = "",
    var dryingTemperature: String = "",
    var dryingTime: String = "",
    var stockAnticorrosionMaterial: String = "",
    var jointName: String = "",
    var applyingMethod: String = "",
    var precipitation: Type = Type(),
    var workScope: WorkScope = WorkScope(),
    var shift: String = "",
    var executors: List<String> = mutableListOf(),
    var responsibleWorkerUid: String = "",
    var inspectionResult: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)