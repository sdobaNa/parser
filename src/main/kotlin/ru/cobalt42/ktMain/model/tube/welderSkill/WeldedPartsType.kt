package ru.cobalt42.ktMain.model.tube.welderSkill

import org.springframework.data.mongodb.core.mapping.Field

data class WeldedPartsType(
    @Field("id")
    var id: Int = 0,
    var name: String = "",
    var firstTypeId: Int = 0,
    var secondTypeId: Int = 0
)
