package com.example.primeiroprojeto.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.example.primeiroprojeto.R
import com.example.primeiroprojeto.classes.SingletonTest
import com.google.android.material.snackbar.Snackbar

class TesteInterfaceActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teste_interface)

        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val layout = findViewById<ConstraintLayout>(R.id.layout)

        button.setOnClickListener(this)
        button2.setOnClickListener(this)
        layout.setOnClickListener(this)

    }

    override fun onClick(v: View) {

        v?.let {
            when(it.id) {

                R.id.button -> {
                    println(SingletonTest.uid)
                    SingletonTest.uid = "7777777"
                    Snackbar.make(it, SingletonTest.uid, Snackbar.LENGTH_LONG).show()
//                    Snackbar.make(it, getString(R.string.touch_button), Snackbar.LENGTH_LONG).show()
                }

                R.id.button2 -> {
                    Snackbar.make(it, getString(R.string.touch_button_2), Snackbar.LENGTH_LONG).show()
                }

                R.id.layout -> {
                    Snackbar.make(it, getString(R.string.touch_screen), Snackbar.LENGTH_LONG).show()
                }

            }
        }

    }

}