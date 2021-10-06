package ru.cobalt42.ktMain.model.technologicalCard

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class TechnologicalCard(
    var uid: String = "",
    var name: String = "",
    val cipher: String = "",
    val date: String = "",
    val projectUid: String = "",
    val comment: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)