package ru.cobalt42.ktMain.model.commonDocument.mechanismTestAct

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.cobalt42.ktMain.model.dictionary.Target

@Document
data class MechanismTestAct(
    var uid: String? = "",
    val name: String = "",
    val date: String = "",
    val target: Target = Target(),
    val mechanisms: List<Mechanism> = emptyList(),
    val signers: Signers = Signers(),
    val comment: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)
