package com.poema.lektion1android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    val TAG = MainActivity::class.java.simpleName
    lateinit var editText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    Log.d(TAG,"Hej!")
    val editText = findViewById(R.id.inputText)
    val button = findViewById<Button>(R.id.button)

        button.text = "Tryck"

    }
    fun buttonPressed(view: View) {
        val message = editText.toString()
        Log.d(TAG,"Button pressed!")

    }
}
