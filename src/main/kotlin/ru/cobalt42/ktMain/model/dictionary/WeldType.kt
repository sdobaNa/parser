package ru.cobalt42.ktMain.model.dictionary

import org.springframework.data.mongodb.core.mapping.Field

data class WeldType(
    @Field("id")
    var id: Int = 0,
    var name: String = ""
)
