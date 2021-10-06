package ru.cobalt42.ktMain.model.tube.jointTubeLinePart

import ru.cobalt42.ktMain.model.dictionary.WeldingMaterial
import ru.cobalt42.ktMain.model.dictionary.WeldingMethod
import ru.cobalt42.ktMain.model.dictionary.WeldingPosition

data class JointKit(
    var weldingMethod: WeldingMethod = WeldingMethod(),
    var weldingMaterial: WeldingMaterial = WeldingMaterial(),
    var weldingPosition: WeldingPosition = WeldingPosition(),
    var closed: Boolean = false
)
