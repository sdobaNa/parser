package ru.cobalt42.ktMain.model.common

import com.fasterxml.jackson.annotation.JsonIgnore
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.cobalt42.ktMain.model.dictionary.CommodityEntry

@Document
data class Specification(
    var uid: String = "",
    val name: String = "",
    val commodities: MutableList<CommodityEntry> = mutableListOf(),
    val date: String = "",
    val stamp: String = "",
    val comment: String = "",
    @Id
    @JsonIgnore
    var _id: ObjectId = ObjectId.get()
)
