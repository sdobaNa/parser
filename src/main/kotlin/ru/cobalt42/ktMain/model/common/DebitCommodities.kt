package ru.cobalt42.ktMain.model.common

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.cobalt42.ktMain.model.dictionary.CommodityEntry
import ru.cobalt42.ktMain.model.dictionary.Target

@Document
data class DebitCommodities(
    var uid: String = "",
    var name: String = "",
    var target: Target = Target(),
    var commodities: List<CommodityEntry> = mutableListOf(),
    var date: String = "",
    var comment: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)