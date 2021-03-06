package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Кинуть кубик"
        rollButton.setOnClickListener {
            // Toast.makeText(this, "нажата кнопка", Toast.LENGTH_LONG).show()
            rollDice()
        }
    }

    private fun rollDice() {

        // val resultText: TextView = findViewById(R.id.result_text)
        // resultText.text = "Кубик брошен!!!"
        val randomInt = Random().nextInt(6) + 1
        // lateinit var diceImage: ImageView
        val diceImage: ImageView  = findViewById(R.id.dice_image)
        // resultText.text = randomInt.toString()
        diceImage.setImageResource(
            when (randomInt) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
        )


    }
}
