package ru.cobalt42.ktMain.model.common.work

import ru.cobalt42.ktMain.model.dictionary.Target

data class UnapprovedWorks(
    val target: Target,
    val workTypes: List<Int>
)