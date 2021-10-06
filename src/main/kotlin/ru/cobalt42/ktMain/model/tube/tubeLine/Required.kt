package ru.cobalt42.ktMain.model.tube.tubeLine

data class Required(
    val previousTubeLine: Boolean = false,
    val postWeldHeatTreatment: Boolean = false
)
