package ru.cobalt42.ktMain.model.common.certificate

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import ru.cobalt42.ktMain.model.commonDocument.equipmentDefectsAct.Type
import ru.cobalt42.ktMain.model.dictionary.Organization

data class Certificate(
    var uid: String = "",
    var name: String = "",
    val type: CertificateType = CertificateType(),
    val issuanceDate: String = "",
    val expirationDate: String = "",
    val personUid: String = "",
    val organizations: Organization = Organization(),
    val comment: String = "",
    val rank: String = "", // Удостоверение монтажника болтов
    val level: Type = Type(), // Удостоверение дефектоскописта
    val specializationByControlTypes: List<Type> = mutableListOf(), // Удостоверение дефектоскописта
    @Id
    var _id: ObjectId = ObjectId.get()
)