package ru.cobalt42.ktMain.model.common.person

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Person(
    var uid: String = "",
    var firstName: String = "",
    val secondName: String = "",
    val lastName: String = "",
    val name: String = "",
    val positionUid: String = "",
    val certificateRepresentation: String = "",
    val nrsNumber: String = "",
    var stamp: String = "",
    val constructionControl: Boolean = false,
    val incomingControl: Boolean = false,
    val comment: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)
