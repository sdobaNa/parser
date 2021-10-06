package ru.cobalt42.ktMain.model.commonDocument.protectiveCoatingAct

import ru.cobalt42.ktMain.model.commonDocument.Signer

data class Signers(
    val customer: Signer = Signer(),
    val construct: Signer = Signer(),
    val mainConstruct: Signer = Signer()
)
