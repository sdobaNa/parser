package ru.cobalt42.ktMain.model.commonDocument.vesselApparatusTestAct

import ru.cobalt42.ktMain.model.commonDocument.Signer
import ru.cobalt42.ktMain.model.commonDocument.hiddenWorkAct.StepSigner

data class Signers(
    val customer: Signer = Signer(),
    val mainConstruct: Signer = Signer(),
    val planner: Signer = Signer(),
    val construct: Signer = Signer(),
    val other: List<Signer> = emptyList()
)
