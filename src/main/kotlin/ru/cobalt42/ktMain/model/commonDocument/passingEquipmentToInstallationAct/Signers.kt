package ru.cobalt42.ktMain.model.commonDocument.passingEquipmentToInstallationAct

import ru.cobalt42.ktMain.model.commonDocument.Signer

data class Signers(
    val customer: Signer = Signer(),
    val construct: Signer = Signer(),
    val responsible: Signer = Signer(),
    val planner: Signer = Signer(),
    val manufacturer: Signer = Signer(),
    val provider: Signer = Signer()
)
