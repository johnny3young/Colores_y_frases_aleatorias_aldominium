package com.black3.app.colores_y_frases_aleatorias_aldominium

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Generated event ClickListener
        //Generated color random
        //Generated phrase random


        button_random.setOnClickListener {
            val colors = resources.getIntArray(R.array.phrasesColors)
            val phrases = resources.getStringArray(R.array.phrases)
            val randomColor = colors[getRandomNumber(colors.size)]

            //Color Text View
            textViewPhrase.text = phrases[getRandomNumber(phrases.size)]
            textViewPhrase.setTextColor(randomColor)

            //Color Button
            button_random.setBackgroundColor(randomColor)

        }
    }

    private fun getRandomNumber (max: Int): Int {
        return (Math.random() * max).toInt() //Es lo mismo que: private fun getRandomNumber (max: Int) = (Math.random() * max).toInt()
    }

}
