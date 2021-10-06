package ru.cobalt42.ktMain.model.tube.jointTubeLinePart

import org.springframework.data.mongodb.core.mapping.Field

data class Kind(
    @Field("id")
    var id: Int = 0,
    var name: String = "",
    var ru: String = "",
    var en: String = ""
)