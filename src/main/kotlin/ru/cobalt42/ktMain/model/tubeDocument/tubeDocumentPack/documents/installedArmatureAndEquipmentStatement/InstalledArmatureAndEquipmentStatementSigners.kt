package ru.cobalt42.ktMain.model.tubeDocument.tubeDocumentPack.documents.installedArmatureAndEquipmentStatement

import ru.cobalt42.ktMain.model.dictionary.Signer

data class InstalledArmatureAndEquipmentStatementSigners(
    val customer: Signer = Signer(), // заказчик
    val mainConstruct: Signer = Signer(), // ген. подрядчик
    val construct: Signer = Signer(), // подрядчик (монтажная)
    val control: Signer = Signer(), // строительный надзор
)
