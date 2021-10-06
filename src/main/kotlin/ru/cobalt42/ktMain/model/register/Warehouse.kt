package ru.cobalt42.ktMain.model.register

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Warehouse(
    var uid: String = "",
    var targetUname: String = "",
    var targetUid: String = "",
    var docUname: String = "",
    var docUid: String = "",
    var docDate: String = "",
    var commodityUname: String = "",
    var commodityUid: String = "",
    var quantity: Number = 0,
    var unitId: Int = 0,
    var entryType: String = "",
    var date: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)
