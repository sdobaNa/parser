package ru.cobalt42.ktMain.model.tube.tubeLinePart

import org.springframework.data.mongodb.core.mapping.Document

@Document
data class TubeLinePart(
    var uid: String = "",
    var name: String = "",
    var uname: String = "",
    var type: Type = Type(),
    var parameters: List<Parameters> = mutableListOf(),
    var length: String = "",
    var height: String = "",
    var width: String = "",
    var weight: String = "",
    var runningMeterWeight: String = "",
    var factoryStamp: String = "",
    var additionalFactoryNumber: String = "",
    var customId: String = "",
    var pressureClass: String = "",
    var normativeTechDocument: String = "",
    var materialMark: String = "",
    var mainCharacteristics: String = "",
    var tuNumber: String = "",
    var comment: String = ""
)