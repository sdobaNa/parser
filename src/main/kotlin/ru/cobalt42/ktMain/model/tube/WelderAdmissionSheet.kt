package ru.cobalt42.ktMain.model.tube

import com.fasterxml.jackson.annotation.JsonIgnore
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.cobalt42.ktMain.model.dictionary.Organization

@Document
data class WelderAdmissionSheet(
    var uid: String = "",
    var name: String = "",
    var personUid: String = "",
    var rank: String = "",
    var issuanceDate: String = "",
    var expirationDate: String = "",
    val organizations: Organization = Organization(),
    var naksUid: String = "",
    val comment: String = "",
    @Id
    @JsonIgnore
    var _id: ObjectId = ObjectId.get()
)
