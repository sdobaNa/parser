package ru.cobalt42.ktMain.model.commonDocument.incomingControl

import ru.cobalt42.ktMain.model.dictionary.Signer

data class OrganizationSuite(
    var developer: Signer = Signer(),
    var construct: Signer = Signer(),
    var incomingControl: Signer = Signer()
)
