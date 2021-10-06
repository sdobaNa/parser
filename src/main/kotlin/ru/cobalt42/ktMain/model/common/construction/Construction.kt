package ru.cobalt42.ktMain.model.common.construction

import com.fasterxml.jackson.annotation.JsonIgnore
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.cobalt42.ktMain.model.dictionary.Target

@Document
data class Construction(
    var uid: String = "",
    val name: String = "",
    val code: String = "",
    val parent: Target = Target(),
    val type: ConstructionType = ConstructionType(),
    val hasProjectParts: Boolean = false,
    val comment: String = "",
    @Id
    @JsonIgnore
    var _id: ObjectId = ObjectId.get()
)
