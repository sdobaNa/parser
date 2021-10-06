package ru.cobalt42.ktMain.model.common.project

import com.fasterxml.jackson.annotation.JsonIgnore
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.cobalt42.ktMain.model.dictionary.OrganizationSuite

@Document
data class Project(
    var uid: String = "",
    val code: String = "",
    val name: String = "",
    val city: String = "",
    val fullAddress: String = "",
    val hasProjectParts: Boolean = false,
    val copyCount: String = "",
    val defaultOrganizations: OrganizationSuite = OrganizationSuite(),
    val comment: String = "",
    val localization: String = "",
    val necessaryDocuments: NecessaryDocuments = NecessaryDocuments(),
    @Id
    @JsonIgnore
    var _id: ObjectId = ObjectId.get()
)
