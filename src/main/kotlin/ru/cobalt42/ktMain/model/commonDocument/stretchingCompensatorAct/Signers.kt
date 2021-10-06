package ru.cobalt42.ktMain.model.commonDocument.stretchingCompensatorAct

import ru.cobalt42.ktMain.model.commonDocument.Signer

data class Signers(
    var customer: Signer = Signer(),
    var construct: Signer = Signer()
)
