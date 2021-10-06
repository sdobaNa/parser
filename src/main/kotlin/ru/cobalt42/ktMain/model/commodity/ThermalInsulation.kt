package ru.cobalt42.ktMain.model.commodity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.cobalt42.ktMain.model.dictionary.type.Type

@Document
data class ThermalInsulation(
    var uid: String = "",
    val name: String = "",
    val uname: String = "",
    val normativeTechDocument: String = "",
    val tareValue: String = "",
    val tareWeight: String = "",
    val estimatedArea: String = "",
    val consumptionOfLiters: String = "",
    val consumptionOfKg: String = "",
    val type: Type = Type(),
    val rollLength: String = "",
    val rollWidth: String = "",
    val thickness: String = "",
    val innerDiameter: String = "",
    val square: String = "",
    val comment: String = "",
    val packageAmount: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)
