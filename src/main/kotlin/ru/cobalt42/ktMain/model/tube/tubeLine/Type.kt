package ru.cobalt42.ktMain.model.tube.tubeLine

import org.springframework.data.mongodb.core.mapping.Field

data class Type(
    @Field("id")
    val id: Int = 0,
    val label: String = ""
)
