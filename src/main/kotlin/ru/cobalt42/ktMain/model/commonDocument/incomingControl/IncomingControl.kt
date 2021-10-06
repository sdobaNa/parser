package ru.cobalt42.ktMain.model.commonDocument.incomingControl

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.cobalt42.ktMain.model.dictionary.CommodityEntry
import ru.cobalt42.ktMain.model.dictionary.Target

@Document
data class IncomingControl(
    var uid: String = "",
    var name: String = "",
    var organizations: OrganizationSuite = OrganizationSuite(),
    var comment: String = "",
    var commodityType: CommodityType = CommodityType(),
    var inspectionType: String = "",
    var date: String = "",
    var assert: Boolean = true,
    var target: Target = Target(),
    var projectSheets: String = "",
    var electrodeApprovalUid: String = "",
    var commodities: List<CommodityEntry> = mutableListOf(),
    @Id
    var _id: ObjectId = ObjectId.get()
)