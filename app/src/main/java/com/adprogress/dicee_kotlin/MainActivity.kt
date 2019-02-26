package com.adprogress.dicee_kotlin

import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val diceArray = arrayOf(R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, R.drawable.dice6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun rollButtonTapped(view: View) {
        leftDice.setImageResource(diceArray[Random.nextInt(0, 6)])
        rightDice.setImageResource(diceArray[Random.nextInt(0, 6)])
    }
}
