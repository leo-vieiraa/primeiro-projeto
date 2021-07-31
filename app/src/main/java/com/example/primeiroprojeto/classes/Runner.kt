package com.example.primeiroprojeto.classes


fun main() {

    val arrayDeAnimais = arrayListOf<Animal>()
    arrayDeAnimais.add(Cachorro())
    arrayDeAnimais.add(Cobra())
    arrayDeAnimais.add(Cobra())

    arrayDeAnimais.forEach { animal ->
        animal?.apply {
            var ruido = ""
            if (this is Cobra) {
                ruido = (this as Cobra).ruido()
            } else if (this is Cachorro) {
                ruido = (this as Cachorro).ruido()
            }
//            println(ruido)
        }
    }

    val arrayDeNumeros = arrayOf(5, 2, 16, 18, 20, 25, 14)

    arrayDeNumeros.forEach {
//        println(it)
    }

    arrayDeNumeros.filter {it > 10}.sortedDescending().forEach {
//        println(it)
    }

    val arraylistDeNomes = ArrayList<String>()

    val arrayDeNomes = arrayOf(
        "Silva",
        "Santos",
        "Ferreira",
        "Pereira",
        "Oliveira",
        "Costa",
        "Rodrigues",
        "Martins",
        "Sousa",
        "Fernandes",
    )

    arrayDeNomes.sortedArray().forEach {
        arraylistDeNomes.add(it)
        println(it)
    }

    println("---------------------")

    println(arraylistDeNomes)


//    val cachorro = Cachorro()
//
//    cachorro.movimentar()
//
//    printVeiculo(TipoVeiculo.CARRO)
//
//    var veiculo = Veiculo("diesel", "2.0", TipoVeiculo.CARRO)
//
//    var pessoa = Pessoa(TipoPessoa.ALUNO)
//
//    println("Tipo: ${pessoa.tipo.nomeTipo} ---- Id: ${pessoa.tipo.uid}")

}

fun printVeiculo(tipo: TipoVeiculo) {

    when(tipo){
        TipoVeiculo.CARRO -> println("Selecionado ${TipoVeiculo.CARRO}")
        TipoVeiculo.MOTO -> println("Selecionado ${TipoVeiculo.MOTO}")
        TipoVeiculo.CAMINHAO -> println("Selecionado ${TipoVeiculo.CAMINHAO}")
    }

}