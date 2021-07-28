package com.example.primeiroprojeto.classes

open class Animal (

    private var categoria: String

        ) {

    open fun movimentar() {
        println("Animal se movimentando")
    }

}