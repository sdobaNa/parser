package ru.cobalt42.ktMain.model.dictionary

import org.springframework.data.mongodb.core.mapping.Field

data class TechDevDangerGroup(
    @Field("id")
    var id: Int = 0,
    var name: String = "",
    var description: String = "",
    var clause: List<Clause> = mutableListOf()
)
