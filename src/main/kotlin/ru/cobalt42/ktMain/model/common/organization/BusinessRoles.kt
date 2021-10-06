package ru.cobalt42.ktMain.model.common.organization

data class BusinessRoles(
    var customer: Boolean = false,
    var construct: Boolean = false,
    var planner: Boolean = false,
    var control: Boolean = false,
    var operator: Boolean = false,
    var lab: Boolean = false,
    var metrology: Boolean = false,
    var other: Boolean = false,
)
