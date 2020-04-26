package com.galaktionov.profile

class Profile(
    val id: Long,
    var login: String,
    var name: String,
    var surname: String,
    var status: String = "Active",
    var avatar: String = "Default"
) {

    val fullName
        get() = "$name $surname"
}