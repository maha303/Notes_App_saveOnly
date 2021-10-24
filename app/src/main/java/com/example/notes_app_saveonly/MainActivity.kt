package com.example.notes_app_saveonly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var edNotes:EditText
    private lateinit var btnSave:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edNotes=findViewById(R.id.edNotes)
        btnSave=findViewById(R.id.btnSave)
        btnSave.setOnClickListener {
            val notes = edNotes.text.toString()
            var dhh=DBHelpr(applicationContext)
            dhh.savedat(notes)
            Toast.makeText(applicationContext,"Saved",Toast.LENGTH_SHORT).show()
        }
    }
}