package ru.cobalt42.ktMain.model.common

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.cobalt42.ktMain.model.dictionary.Target

@Document
data class ExecutiveScheme(
    var uid: String = "",
    var name: String = "",
    val organizationUid: String = "",
    val date: String = "",
    val target: Target = Target(),
    var drawing: Any?,
    val comment: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)