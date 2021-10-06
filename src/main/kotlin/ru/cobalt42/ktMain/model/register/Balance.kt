package ru.cobalt42.ktMain.model.register

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Balance(
    var targetUname: String = "",
    var targetUid: String = "",
    var commodityUname: String = "",
    var commodityUid: String = "",
    var balance: Number = 0,
    @Id
    var _id: ObjectId = ObjectId.get()
)
