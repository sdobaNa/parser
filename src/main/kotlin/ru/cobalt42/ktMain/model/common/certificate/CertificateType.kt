package ru.cobalt42.ktMain.model.common.certificate

import org.springframework.data.mongodb.core.mapping.Field

data class CertificateType (
    @Field("id")
    val id: Int = 0,
    val label: String = ""
)