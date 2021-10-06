package ru.cobalt42.ktMain.model.commonDocument.qualityDocument

import com.fasterxml.jackson.annotation.JsonIgnore
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class QualityDocument(
    var uid: String = "",
    var name: String = "",
    var date: String = "",
    var organizations: Organizations = Organizations(),
    var dateOfDelivery: String = "",
    var comment: String = "",
    @JsonIgnore
    @Id
    var _id: ObjectId = ObjectId.get()
)