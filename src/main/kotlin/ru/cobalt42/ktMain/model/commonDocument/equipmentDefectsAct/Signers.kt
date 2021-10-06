package ru.cobalt42.ktMain.model.commonDocument.equipmentDefectsAct

import ru.cobalt42.ktMain.model.commonDocument.Signer

data class Signers(
    val customer: Signer = Signer(),
    val manufacturer: Signer = Signer(),
    val construct: Signer = Signer(),
    val provider: Signer = Signer(),
    val shipper: Signer = Signer(),
    val carrier: Signer = Signer()
)
