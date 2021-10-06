package ru.cobalt42.ktMain.model.commonDocument.mechanismTestAct

import ru.cobalt42.ktMain.model.commonDocument.Signer

data class Signers(
    val customer: Signer = Signer(), // заказчик
    val mainConstruct: Signer = Signer(), // ген. подрядчик
    val construct: Signer = Signer(), // подрядчик (монтажная)
    val planner: Signer = Signer(), // планировщик
    val control: Signer = Signer(), // строительный надзор
    val other: MutableList<Signer> = mutableListOf(), // иные
)
