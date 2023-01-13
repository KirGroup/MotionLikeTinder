package com.example.sfera.data

data class Account(
    val id: Int,
    val imageProfile: Int,
    val image2: Int,
    val image3: Int,
    val image4: Int,
    val image5: Int,
    val name: String,
    val goals: String,
    val languages: String,
    val location: String,
    val lookingFor: String,
    val about: String
)

data class DetailAccount(
    val id: Int,
    val id2: Int,
    val imageProfile: Int,
    val imageProfile2: Int,
    val image2: Int,
    val image3: Int,
    val image4: Int,
    val image5: Int,
    val name: String,
    val name2: String,
    val goals: String,
    val goals2: String,
    val languages: String,
    val location: String,
    val lookingFor: String,
    val about: String
) {
    constructor(account: Account, nextAccount: Account) : this(
        account.id,
        nextAccount.id,
        account.imageProfile,
        nextAccount.imageProfile,
        account.image2,
        account.image3,
        account.image4,
        account.image5,
        account.name,
        nextAccount.name,
        account.goals,
        nextAccount.goals,
        account.languages,
        account.location,
        account.lookingFor,
        account.about
    )
}