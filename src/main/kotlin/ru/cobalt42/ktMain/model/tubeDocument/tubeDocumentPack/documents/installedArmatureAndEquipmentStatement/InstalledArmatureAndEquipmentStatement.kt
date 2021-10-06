package ru.cobalt42.ktMain.model.tubeDocument.tubeDocumentPack.documents.installedArmatureAndEquipmentStatement

import ru.cobalt42.ktMain.model.dictionary.Target

data class InstalledArmatureAndEquipmentStatement(
    val uid: String = "",
    val target: Target = Target(),
    val signers: InstalledArmatureAndEquipmentStatementSigners = InstalledArmatureAndEquipmentStatementSigners()
)
