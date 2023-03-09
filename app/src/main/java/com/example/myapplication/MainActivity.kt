package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Dohvatit cemo referencu na view button-a preko id-a
        val button = findViewById<Button>(R.id.button1);
        //Definisat cemo akciju u slucaju klik akcije
        button.setOnClickListener {
            showMessage()
        }
    }

    private fun showMessage() {
        // Pronaci cemo nas edit text i text view na osnovu id-a
        val editText = findViewById<EditText>(R.id.editText1)
        val textView = findViewById<TextView>(R.id.textView1)
        // Tekst cemo prebaciti u varijablu
        val message = editText.text.toString()
        // Postavimo tekst
        textView.text = message
    }
}