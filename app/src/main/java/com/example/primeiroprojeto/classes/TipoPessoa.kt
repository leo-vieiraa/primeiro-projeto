package com.example.primeiroprojeto.classes

import java.util.*

enum class TipoPessoa(var uid: UUID, var nomeTipo: String) {
    ALUNO( UUID.randomUUID() ,"Aluno"),
    PROFESSOR(UUID.randomUUID(), "Professor"),
    ADM(UUID.randomUUID(), "Administrador")
}