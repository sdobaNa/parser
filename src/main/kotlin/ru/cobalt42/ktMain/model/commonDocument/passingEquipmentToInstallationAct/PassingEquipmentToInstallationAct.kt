package ru.cobalt42.ktMain.model.commonDocument.passingEquipmentToInstallationAct

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.cobalt42.ktMain.model.dictionary.Target

@Document
data class PassingEquipmentToInstallationAct(
    var uid: String? = "",
    val name: String = "",
    val date: String = "",
    val documentName: String = "",
    val documentNumber: String = "",
    val documentDate: String = "",
    val documentOrganizationUid: String = "",
    val target: Target = Target(),
    val equipments: List<EquipmentInfo> = emptyList(),
    val drawingNumber: String = "",
    val acceptanceCertificateNumber: String = "",
    val isComplianceProject: Boolean = false,
    val complianceComment: String = "",
    val isFullComposition: Boolean = false,
    val composition: String = "",
    val isDefectsPresence: Boolean = false,
    val defects: String = "",
    val conclusion: String = "",
    val signers: Signers = Signers(),
    val comment: String = "",
    @Id
    var _id: ObjectId = ObjectId.get()
)
