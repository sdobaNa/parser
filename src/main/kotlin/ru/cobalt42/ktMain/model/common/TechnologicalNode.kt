package ru.cobalt42.ktMain.model.common

import org.bson.types.*
import org.springframework.data.annotation.*
import org.springframework.data.mongodb.core.mapping.*

@Document
data class TechnologicalNode(
    var uid: String? = "",
    val name: String = "",
    val constructionUid: String = "",
    val comment: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)
