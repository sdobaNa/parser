package ru.cobalt42.ktMain.model.common.organization

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Organization(
    var uid: String = "",
    var name: String = "",
    var address: String = "",
    var phone: String = "",
    var fax: String = "",
    var inn: String = "",
    var ogrn: String = "",
    var okpo: String = "",
    var selfRegulatoryRegistration: SelfRegulatoryRegistration = SelfRegulatoryRegistration(),
    var selfRegulatoryParameters: SelfRegulatoryParameters = SelfRegulatoryParameters(),
    var businessRoles: BusinessRoles = BusinessRoles(),
    var foreignOrganization: Boolean = false,
    var logo: Logo = Logo(),
    var lab: Laboratory = Laboratory(),
    var isSelfRegulatory: Boolean = false,
    var selfRegulatoryOrgUid: String = "",
    var metrologyRegisterNumber: String = "",
    var comment: String = "",
    @Id
    var _id: ObjectId = ObjectId.get(),
)
