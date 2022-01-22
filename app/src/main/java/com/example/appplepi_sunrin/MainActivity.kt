package com.example.appplepi_sunrin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var number = 100
    lateinit var imageButton: ImageButton;
    lateinit var resetButton: Button;
    lateinit var text: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageButton = findViewById(R.id.image)
        resetButton = findViewById(R.id.reset)
        text = findViewById(R.id.number)

        imageButton.setOnClickListener{
            number = numberCheck(number)
            text.text = number.toString()
        }

        resetButton.setOnClickListener {
            number = 100
            text.text = number.toString()
            imageButton.setImageResource(R.drawable.egg)
        }
    }


    fun numberCheck(number : Int) : Int {
        if(number == 100){
            imageButton.setImageResource(R.drawable.egg)
        }

        else if(number == 80){
            imageButton.setImageResource(R.drawable.egg2)
        }

        else if(number == 50){
            imageButton.setImageResource(R.drawable.egg3)
        }

        else if(number == 10){
            imageButton.setImageResource(R.drawable.egg4)
        }

        else if(number == 0){
            imageButton.setImageResource(R.drawable.aa)
        }

        return number - 1
    }
}
