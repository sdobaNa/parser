package ru.cobalt42.ktMain.model.commonDocument.equipmentInstallationOnFoundationAct

import ru.cobalt42.ktMain.model.commonDocument.Signer

data class Signers(
    val customer: Signer = Signer(), // заказчик
    val mainConstruct: Signer = Signer(), // ген. подрядчик
    val construct: Signer = Signer(), // подрядчик (монтажная)
    val planner: Signer = Signer(), // планировщик
    val other: MutableList<Signer> = mutableListOf(), // иные
)
