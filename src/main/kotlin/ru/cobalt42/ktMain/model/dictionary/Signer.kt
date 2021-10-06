package ru.cobalt42.ktMain.model.dictionary

data class Signer(
    var required: Boolean = true,
    var label: String = "",
    var organizationUid: String = "",
    var personUid: String = ""
)