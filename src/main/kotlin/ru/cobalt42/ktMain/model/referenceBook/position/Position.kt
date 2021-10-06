package ru.cobalt42.ktMain.model.referenceBook.position

import com.fasterxml.jackson.annotation.JsonIgnore
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Position(
    var uid: String = "",
    val name: String = "",
    val roles: Roles = Roles(),
    val comment: String = "",
    val immutable: Boolean = false,
    @Id
    @JsonIgnore
    var _id: ObjectId = ObjectId.get()
)
