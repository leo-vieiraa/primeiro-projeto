package com.example.primeiroprojeto.classes

abstract class Animal (
    val categoria: String
        ) : Som, Movimentacao {

    open fun movimentar() {
        println("Animal se movimentando")
    }

}