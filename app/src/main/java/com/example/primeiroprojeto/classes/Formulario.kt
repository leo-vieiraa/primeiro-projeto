package com.example.primeiroprojeto.classes

class Formulario(
    var name : String?,
    var email : String?,
    var password : String?
    ) {

    constructor() : this(null, null, null)

    fun checkAllFields(): Boolean {
        return checkName() && checkEmail() && checkPassword()
    }

    fun checkName(): Boolean {
        return !name.isNullOrEmpty()
    }

    fun checkEmail(): Boolean {
        return !email.isNullOrEmpty()
    }

    fun checkPassword(): Boolean {
        return !password.isNullOrEmpty()
    }

}