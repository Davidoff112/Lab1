package com.example.lab1

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.round

class MainActivity : AppCompatActivity() {

    var valueCircle: TextView? = null
    var valueSquare: TextView? = null
    var valueRectangle: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun circleCalculateFunction(view: View) {
        val editText = findViewById<EditText>(R.id.edit_text_number_circle)
        val text = editText.text.toString()
        var radius = text.toDouble()
        val pi = 3.141
        var area = round(pi * radius * radius)/10.0
        var areaCircle:String = area.toString()
        valueCircle?.setText(areaCircle)
        valueCircle = findViewById(R.id.textAreaCircle)
    }

    fun squareCalculate(view: View) {
        val editText = findViewById<EditText>(R.id.edit_text_number_square)
        val text = editText.text.toString()
        val sideSquare = text.toDouble()
        val area =  round(sideSquare * sideSquare)/10.0
        val areaSquare:String = area.toString()
        valueSquare?.setText(areaSquare)
        valueSquare = findViewById(R.id.textAreaSquare)
    }

    fun rectangleCalculate(view: View) {
        val editText = findViewById<EditText>(R.id.edit_text_number_rectangle)
        val text = editText.text.toString()
        val sideRectangle = text.toDouble()
        val editText2 = findViewById<EditText>(R.id.edit_text_number_rectangle2)
        val text2 = editText2.text.toString()
        val sideRectangle2 = text2.toDouble()
        val area =  round(sideRectangle * sideRectangle2) /10.0
        val areaRectangle:String = area.toString()
        valueRectangle?.setText(areaRectangle)
        valueRectangle = findViewById(R.id.textAreaRectangle)
    }
}