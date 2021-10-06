package ru.cobalt42.ktMain.model.linkedData

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("jointTubeLinePart_person")
data class JointTubeLinePartPerson(
    var jointTubeLinePartUid: String = "",
    var personUid: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)