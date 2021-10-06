package ru.cobalt42.ktMain.model.commonDocument.hiddenWorkAct

import ru.cobalt42.ktMain.model.commonDocument.Signer

data class Signers(
    val customer: StepSigner = StepSigner(),
    val mainConstruct: Signer = Signer(),
    val control: Signer = Signer(),
    val planner: StepSigner = StepSigner(),
    val construct: Signer = Signer(),
    val other: List<Signer> = emptyList()
)
