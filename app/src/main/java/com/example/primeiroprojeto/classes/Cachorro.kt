package com.example.primeiroprojeto.classes

class Cachorro() : Animal("Mamifero") {

    override fun movimentar() {
        super.movimentar()
        println("O cachorro caminha em 4 patas")
    }

    override fun ruido(): String {
        return "au au...."
    }

    override fun frente(): String {
        TODO("Not yet implemented")
    }

    override fun lado() {
        TODO("Not yet implemented")
    }

    override fun random() {
        TODO("Not yet implemented")
    }

}