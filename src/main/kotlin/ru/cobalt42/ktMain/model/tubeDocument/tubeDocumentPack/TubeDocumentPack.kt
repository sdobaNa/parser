package ru.cobalt42.ktMain.model.tubeDocument.tubeDocumentPack

import com.fasterxml.jackson.annotation.JsonIgnore
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.cobalt42.ktMain.model.dictionary.Target
import ru.cobalt42.ktMain.model.exception.ExceptionMessage
import ru.cobalt42.ktMain.model.tubeDocument.tubeDocumentPack.documents.Documents
import ru.cobalt42.ktMain.model.tubeDocument.tubeDocumentPack.extraDocuments.ExtraDocuments

@Document
data class TubeDocumentPack(
    var uid: String = "",
    var name: String = "",
    val date: String = "",
    val target: Target = Target(),
    val bookNumber: String = "",
    val tomeNumber: String = "",
    val documents: Documents = Documents(),
    val extraDocuments: MutableList<ExtraDocuments> = mutableListOf(),
    val messages: MutableList<ExceptionMessage> = mutableListOf(),
    var comment: String = "",
    @Id
    @JsonIgnore
    var _id: ObjectId = ObjectId.get()
)
