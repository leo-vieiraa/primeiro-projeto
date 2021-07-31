package com.example.primeiroprojeto.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.primeiroprojeto.R
import com.example.primeiroprojeto.adapter.AdapterListaNomes

class PrimeiraListaActivity : AppCompatActivity() {

    lateinit var recyclerViewNomes: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primeira_lista)

        val arrayNomes = arrayListOf(
            "Silva",
            "Santos",
            "Ferreira",
            "Pereira",
            "Oliveira",
            "Silva",
            "Santos",
            "Ferreira",
            "Pereira",
            "Oliveira"
        )

        recyclerViewNomes = findViewById(R.id.recyclerViewNomes)
        recyclerViewNomes.adapter = AdapterListaNomes(arrayNomes)
//        recyclerViewNomes.layoutManager = LinearLayoutManager(this)
        recyclerViewNomes.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

    }
}