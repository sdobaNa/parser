package ru.cobalt42.ktMain.model.commonDocument.equipmentAfterIndividualTestAct

import ru.cobalt42.ktMain.model.commonDocument.Signer

data class Signers(
    val customer: Signer = Signer(), // заказчик
    val mainConstruct: Signer = Signer(), // ген. подрядчик
    val constructs: List<Signer> = mutableListOf(), // подрядчики (монтажники)
    val mainPlanner: Signer = Signer(), // ген. планировщик
    val control: Signer = Signer(), // строительный надзор
    val operator: Signer = Signer(), // эксплуатационая
    val other: MutableList<Signer> = mutableListOf(), // иные
)
