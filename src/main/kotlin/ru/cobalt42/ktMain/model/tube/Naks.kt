package ru.cobalt42.ktMain.model.tube

import com.fasterxml.jackson.annotation.JsonIgnore
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.cobalt42.ktMain.model.dictionary.Organization

@Document
data class Naks(
    var uid: String = "",
    val name: String = "",
    val personUid: String = "",
    val rank: String = "",
    val issuanceDate: String = "",
    val expirationDate: String = "",
    val organizations: Organization = Organization(),
    val comment: String = "",
    @Id
    @JsonIgnore
    var _id: ObjectId = ObjectId.get()
)
