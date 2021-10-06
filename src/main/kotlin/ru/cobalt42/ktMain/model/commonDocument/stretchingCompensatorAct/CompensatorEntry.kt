package ru.cobalt42.ktMain.model.commonDocument.stretchingCompensatorAct

data class CompensatorEntry(
    var commodityUid: String = "",
    var innerDiameter: String = "",
    var compensatorLengthStock: String = "",
    var compensatorLengthAfterPayload: String = "",
    var ambientTemperature: String = "",
    var compensatorName: String = "",
    var compensatorType: String = "",
    var projectStretchValue: String = "",
    var actualStretchValue: String = ""
)