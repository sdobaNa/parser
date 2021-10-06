package ru.cobalt42.ktMain.model.dictionary

import org.springframework.data.mongodb.core.mapping.Field

data class Clause(
    @Field("id")
    var id: Int = 0,
    var name: String = "",
    var description: String = "",
    var checked: Boolean = false
)
