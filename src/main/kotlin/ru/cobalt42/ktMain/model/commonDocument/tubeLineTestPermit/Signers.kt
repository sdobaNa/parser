package ru.cobalt42.ktMain.model.commonDocument.tubeLineTestPermit

import ru.cobalt42.ktMain.model.dictionary.Signer

data class Signers(
    val chairman: Signer = Signer(),
    val comissionMember: List<Signer> = emptyList()
)
