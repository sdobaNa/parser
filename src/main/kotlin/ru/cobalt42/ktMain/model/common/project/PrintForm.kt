package ru.cobalt42.ktMain.model.common.project

import org.springframework.data.mongodb.core.mapping.Field

data class PrintForm(
    @Field("id")
    val id: Number = 0,
    val name: String = ""
)
