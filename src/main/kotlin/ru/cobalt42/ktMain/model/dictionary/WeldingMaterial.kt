package ru.cobalt42.ktMain.model.dictionary

import org.springframework.data.mongodb.core.mapping.Field

data class WeldingMaterial(
    @Field("id")
    var id: Int = 0,
    var name: String = "",
    var description: String = ""
)
