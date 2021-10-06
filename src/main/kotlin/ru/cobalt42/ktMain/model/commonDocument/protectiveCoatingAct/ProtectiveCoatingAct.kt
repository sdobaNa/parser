package ru.cobalt42.ktMain.model.commonDocument.protectiveCoatingAct

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.cobalt42.ktMain.model.dictionary.Target

@Document
data class ProtectiveCoatingAct(
    var uid: String = "",
    val name: String = "",
    val signers: Signers = Signers(),
    val works: List<String> = emptyList(),
    val date: String = "",
    val target: Target = Target(),
    val drawingSheets: String = "",
    val axes: String = "",
    val comment: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)
