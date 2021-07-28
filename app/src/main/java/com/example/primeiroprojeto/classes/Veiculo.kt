package com.example.primeiroprojeto.classes

class Veiculo (

    private val motor : String,
    private var combustivel : String,

) {

    constructor() : this("", "")

    constructor(motor: String) : this(motor, "")

    fun verificaMotor() : Boolean {
        return motor.isNotEmpty() && motor.length >= 2
    }

    fun verificaCombustivel(){
        println(combustivel)
    }

}