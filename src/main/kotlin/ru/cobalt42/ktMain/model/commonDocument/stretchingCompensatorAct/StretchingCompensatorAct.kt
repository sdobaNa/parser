package ru.cobalt42.ktMain.model.commonDocument.stretchingCompensatorAct

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.cobalt42.ktMain.model.dictionary.Target

@Document
data class StretchingCompensatorAct(
    var name: String = "",
    var uid: String = "",
    var target: Target = Target(),
    var signers: Signers = Signers(),
    var date: String = "",
    var sectionBeginning: String = "",
    var sectionEnding: String = "",
    var drawings: MutableList<String> = mutableListOf(),
    var compensatorEntries: MutableList<CompensatorEntry> = mutableListOf(),
    var quantity: String = "",
    var comment: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)
