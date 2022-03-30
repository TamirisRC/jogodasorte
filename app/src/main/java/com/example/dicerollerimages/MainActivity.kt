package com.example.dicerollerimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoller: Button= findViewById(R.id.btnRolller)
        btnRoller.setOnClickListener{ diceRoller()}

    }
    private fun diceRoller(){
        val imgDiceRoller: ImageView= findViewById(R.id.imgDiceRoller)
        val randomInt = (1..6).random()

        val drawableResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6


        }

        val edtNumber: EditText = findViewById(R.id.edtNumber)

        if(edtNumber.length() != 0){
            if(randomInt == Integer.parseInt(edtNumber.text.toString())){
                Toast.makeText(this, "You Win!", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "You lose!", Toast.LENGTH_SHORT).show()
            }
        }else{
            Toast.makeText(this, "Preencha o campo da sorte!", Toast.LENGTH_SHORT).show()
        }



        imgDiceRoller.setImageResource(drawableResource)

    }
}