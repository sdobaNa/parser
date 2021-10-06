package ru.cobalt42.ktMain.model.commodity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class FastenerPart(
    var uid: String = "",
    var name: String = "",
    var uname: String = "",
    var diameter: String = "",
    var length: String = "",
    var onePieceWeight: String = "",
    var comment: String = "",
    var normativeTechDocument: String = "",
    var materialMark: String = "",
    var packageAmount: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)