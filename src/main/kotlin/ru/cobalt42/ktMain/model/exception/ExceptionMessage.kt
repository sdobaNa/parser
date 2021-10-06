package ru.cobalt42.ktMain.model.exception

import ru.cobalt42.ktMain.model.dictionary.Target

data class ExceptionMessage(
    val code: Int = 0,
    val uname: String = "",
    val title: String = "",
    var description: String = "",
    val target: Target = Target(),
    val source: Target = Target(),
    var section: String = "",
)
