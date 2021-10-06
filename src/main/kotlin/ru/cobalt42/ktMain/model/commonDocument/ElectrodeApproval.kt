package ru.cobalt42.ktMain.model.commonDocument

import com.fasterxml.jackson.annotation.JsonIgnore
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class ElectrodeApproval(
    var uid: String = "",
    var name: String = "",
    val date: String = "",
    val projectUid: String = "",
    val organizationUid: String = "",
    val welderChiefUid: String = "",
    val welderUid: String = "",
    val materialUid: String = "",
    val consignment: String = "",
    val partWidth: String = "",
    val steelMark: String = "",
    val comment: String = "",
    @Id
    @JsonIgnore
    var _id: ObjectId = ObjectId.get()
)
