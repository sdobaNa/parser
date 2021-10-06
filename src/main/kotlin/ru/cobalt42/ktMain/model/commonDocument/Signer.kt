package ru.cobalt42.ktMain.model.commonDocument

data class Signer(
    val organizationUid: String = "",
    val personUid: String = "",
    var required: Boolean = true
)
