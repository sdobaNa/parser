package ru.cobalt42.ktMain

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import ru.cobalt42.ktMain.parser.Parser

@ComponentScan
@SpringBootApplication
class KtMainApplication

fun main(args: Array<String>) {
    runApplication<KtMainApplication>(*args)
    Parser().convert()
}

