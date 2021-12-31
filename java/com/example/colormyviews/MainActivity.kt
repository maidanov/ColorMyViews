package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()

    }

    private fun makeColored(view: View) {
        val box_three=findViewById<TextView>(R.id.box_three_text)
        val box_four=findViewById<TextView>(R.id.box_four_text)
        val box_five=findViewById<TextView>(R.id.box_five_text)

        when (view.id) {

            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.dice_1)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.dice_2)
            R.id.box_three_text -> view.setBackgroundResource(R.drawable.dice_3)
            R.id.box_four_text -> view.setBackgroundResource(R.drawable.dice_4)
            R.id.box_five_text -> view.setBackgroundResource(R.drawable.dice_5)
            R.id.red_button -> box_three.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }

    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val redButton = findViewById<Button>(R.id.red_button)
        val greenButton = findViewById<Button>(R.id.green_button)
        val yellowButton = findViewById<Button>(R.id.yellow_button)
        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout,
                redButton, greenButton, yellowButton
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }

    }
}