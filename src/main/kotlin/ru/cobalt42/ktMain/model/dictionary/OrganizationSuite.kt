package ru.cobalt42.ktMain.model.dictionary

data class OrganizationSuite(
    val developer: Signer = Signer(),
    val customer: Signer = Signer(),
    val mainConstruct: Signer = Signer(),
    val construct: Signer = Signer(),
    val mainPlanner: Signer = Signer(),
    val planner: Signer = Signer(),
    val constructionControl: Signer = Signer(),
    val incomingControl: Signer = Signer(),
    val operator: Signer = Signer()
)
