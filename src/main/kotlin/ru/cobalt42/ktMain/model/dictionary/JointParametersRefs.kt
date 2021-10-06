package ru.cobalt42.ktMain.model.dictionary

import ru.cobalt42.ktMain.model.tube.jointTubeLinePart.Kind
import ru.cobalt42.ktMain.model.tube.welderSkill.WeldedPartsType

data class JointParametersRefs(
    val weldType: MutableList<WeldType> = mutableListOf(),
    val jointType: MutableList<JointType> = mutableListOf(),
    val weldedPartsType: MutableList<WeldedPartsType> = mutableListOf(),
    val weldingPartType: MutableList<IdName> = mutableListOf(),
    val jointOriginType: MutableList<IdName> = mutableListOf(),
    val jointKinds: MutableList<Kind> = mutableListOf(),
)
