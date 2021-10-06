package ru.cobalt42.ktMain.model.referenceBook.position

data class Engineers(
    var constructionControl: Boolean = false,
    var constructionOrganizator: Boolean = false,
    var authorControl: Boolean = false,
    var chefWelder: Boolean = false,
    var chiefFitter: Boolean = false,
    var chiefConstructor: Boolean = false,
    var chiefWorker: Boolean = false,
    var chiefLab: Boolean = false,
    var defectoscopist: Boolean = false,
    var other: Boolean = false,
)