package com.example.primeiroprojeto.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.primeiroprojeto.R
import com.example.primeiroprojeto.classes.*
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.desafio_form)

        findViewById<EditText>(R.id.nameEditText).apply {

        }

        findViewById<Button>(R.id.saveButton).apply {
            setOnClickListener {
//                Snackbar.make(it, "Click Ok", Snackbar.LENGTH_LONG).show()
//                Toast.makeText(context, "Click Ok", Toast.LENGTH_SHORT).show()
                checkFields(it)
            }
        }

    }

    private fun checkFields(view: View) {
        val form = Formulario()

        findViewById<EditText>(R.id.nameEditText).apply {
            form.name = text.toString()
        }

        findViewById<EditText>(R.id.emailEditText).apply {
            form.email = text.toString()
        }

        findViewById<EditText>(R.id.passwordEditText).apply {
            form.password = text.toString()
        }

        if (form.checkAllFields()) {

            val intent = Intent(this, ApplicationActivity::class.java)
            startActivity(intent)

//            Snackbar.make(
//                view,
//                "${form.name} - ${form.email} - ${form.password}",
//                Snackbar.LENGTH_LONG
//            ).show()

        } else {

            Snackbar.make(view, getString(R.string.message_error), Snackbar.LENGTH_LONG).show()

        }
    }

}