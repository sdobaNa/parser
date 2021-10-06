package ru.cobalt42.ktMain.model.common

import com.fasterxml.jackson.annotation.JsonIgnore
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Drawing(
    var uid: String = "",
    val name: String = "",
    val date: String = "",
    val issuerUid: String = "",
    val comment: String = "",
    @Id
    @JsonIgnore
    var _id: ObjectId = ObjectId.get()
)
