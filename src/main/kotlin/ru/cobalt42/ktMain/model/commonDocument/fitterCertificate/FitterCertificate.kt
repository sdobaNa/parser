package ru.cobalt42.ktMain.model.commonDocument.fitterCertificate

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class FitterCertificate(
    var uid: String = "",
    var name: String = "",
    var issuanceDate: String = "",
    var personUid: String = "",
    var expirationDate: String = "",
    var organizations: Organizations = Organizations(),
    var rank: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)
