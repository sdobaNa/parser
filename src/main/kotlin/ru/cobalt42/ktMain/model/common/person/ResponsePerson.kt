package ru.cobalt42.ktMain.model.common.person

data class ResponsePerson(
    var uid: String = "",
    var firstName: String = "",
    val secondName: String = "",
    val lastName: String = "",
    val name: String = "",
    val positionUid: String = "",
    val certificateRepresentation: String = "",
    val nrsNumber: String = "",
    var stamp: String = "",
    val constructionControl: Boolean = false,
    val incomingControl: Boolean = false,
    val comment: String = "",
    var position: String = "",
    var organizations: String = ""
)
