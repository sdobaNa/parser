package ru.cobalt42.ktMain.model.linkedData

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("incomingControl_qualityDocument")
data class IncomingControlQualityDocument(
    var incomingControlUid: String = "",
    var qualityDocumentUid: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)