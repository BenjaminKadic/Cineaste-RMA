package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView
    private lateinit var editText: EditText
    private lateinit var button: Button
    private val  listaVrijednosti = arrayListOf<String>()
    private lateinit var adapter : MyArrayAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button1);
        editText = findViewById(R.id.editText1)
        listView = findViewById(R.id.listView1)
        adapter = MyArrayAdapter(this, R.layout.element_list, listaVrijednosti)
        listView.adapter=adapter
        button.setOnClickListener {
            addToList()
        }
    }
    private fun addToList() {
        listaVrijednosti.add(0,editText.text.toString())
        adapter.notifyDataSetChanged();
        editText.setText("");
    }
}