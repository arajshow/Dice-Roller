package com.arajshow.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun rollDice(view: android.view.View) {
        rollDuringStart()
    }

    fun rollDuringStart() {

        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Find the ImageView in the layout
        var res = "hehe"

        // Determine which drawable resource ID to use based on the dice roll
     when (diceRoll) {
            1 -> {
                diceImage.setImageResource(R.drawable.dice_1)
                 res ="got 1 , mann you are damm unlucky"
            }
            2 -> {
                diceImage.setImageResource(R.drawable.dice_2)
                res = " bass 2 , kabhi to bda le aao"
            }
            3 -> {
                diceImage.setImageResource(R.drawable.dice_3)
//                res = "pahle se behtar"
            }
            4 -> {
                diceImage.setImageResource(R.drawable.dice_4)
                res =" good enough , try for more"
            }
            5 -> {
                diceImage.setImageResource(R.drawable.dice_5)
                res = "to close to the luckiest number"
            }
            else -> {
                diceImage.setImageResource(R.drawable.dice_6)
                res = "wow! you are really lucky today"
            }
        }


//        Toast.makeText(this, "$res", Toast.LENGTH_SHORT).show()

    }



}

class Dice(val num : Int = 6){

    fun roll() : Int {
        return (1..num).random()
    }
}