package ru.cobalt42.ktMain.model.common

import com.fasterxml.jackson.annotation.JsonIgnore
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class SpecificationRevision(
    var uid: String = "",
    val name: String = "",
    val specificationUid: String = "",
    val date: String = "",
    @Id
    @JsonIgnore
    var _id: ObjectId = ObjectId.get()
)
