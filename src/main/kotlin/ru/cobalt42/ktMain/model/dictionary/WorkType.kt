package ru.cobalt42.ktMain.model.dictionary

import org.springframework.data.mongodb.core.mapping.Field

data class WorkType(
    @Field("id")
    val id: Int = 0,
    val label: String = "",
    val targets: List<String> = emptyList(),
    val materialTypes: List<String> = emptyList(),
    val rules: String = ""
)
