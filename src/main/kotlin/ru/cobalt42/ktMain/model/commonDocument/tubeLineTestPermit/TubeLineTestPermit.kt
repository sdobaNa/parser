package ru.cobalt42.ktMain.model.commonDocument.tubeLineTestPermit

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.cobalt42.ktMain.model.dictionary.Target
import ru.cobalt42.ktMain.model.dictionary.type.Type

@Document
data class TubeLineTestPermit(
    var uid: String = "",
    var name: String = "",
    val date: String = "",
    val organizations: Organizations = Organizations(),
    val signers: Signers = Signers(),
    val tubeLines: List<String> = emptyList(),
    val durability: Durability = Durability(),
    val tightness: Tightness = Tightness(),
    val cleanType: Type = Type(),
    val cleaningDevices: CleaningDevices = CleaningDevices(),
    val technologicalCardUid: String = "",
    val target: Target = Target(),
    val comment: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)
