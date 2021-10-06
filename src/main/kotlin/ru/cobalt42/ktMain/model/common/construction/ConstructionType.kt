package ru.cobalt42.ktMain.model.common.construction

import org.springframework.data.mongodb.core.mapping.Field

data class ConstructionType(
    @Field("id")
    val id: Int = 0,
    var name: String = "",
    var includes: List<Includes> = emptyList()
)
