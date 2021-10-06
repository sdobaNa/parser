package ru.cobalt42.ktMain.model.tubeDocument.tubeDocumentPack.extraDocuments

data class Registry(
    var uid: String = "",
    var uname: String = "",
    var name: String = "",
    var organization: String = "",
    var organizationUid: String = "",
    var pageCount: Int = 0,
    var pageNumbers: String = "",
    var label: String = "",
    var xlsxPath: String = "",
    var pdfPath: String = ""
)
