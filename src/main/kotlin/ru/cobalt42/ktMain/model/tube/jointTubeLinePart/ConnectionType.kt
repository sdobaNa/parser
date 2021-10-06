package ru.cobalt42.ktMain.model.tube.jointTubeLinePart

import org.springframework.data.mongodb.core.mapping.Field

data class ConnectionType(
    @Field("id")
    var id: Int = 0,
    var label: String = ""
)
