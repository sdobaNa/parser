package ru.cobalt42.ktMain.model.commodity.coatingMaterial

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class CoatingMaterial(
    var uid: String = "",
    var name: String = "",
    var uname: String = "",
    var normativeTechDocument: String = "",
    var tareValue: String = "",
    var tareWeight: String = "",
    var estimatedArea: String = "",
    var consumptionOfLiters: String = "",
    var consumptionOfKg: String = "",
    var type: Type = Type(),
    var rollLength: String = "",
    var rollWidth: String = "",
    var comment: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)