package com.example.primeiroprojeto.classes

class Veiculo (

    private val motor : String,
    private var combustivel : String,
    private var tipo: TipoVeiculo?

) {

    constructor() : this("", "", null)

    constructor(motor: String) : this(motor, "", null)

    fun verificaMotor() : Boolean {
        return motor.isNotEmpty() && motor.length >= 2
    }

    fun verificaCombustivel(){
        println(combustivel)
    }

}