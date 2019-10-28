package com.example.nowwithkotlin2

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_display_message.*


class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }

        eye.setImageDrawable(
            ContextCompat.getDrawable(
                applicationContext, // Context
                R.drawable.eyeofsauron // Drawable
            )
        )

        val button: Button = findViewById(R.id.coolstuff)
        button.setOnClickListener{
            ObjectAnimator.ofFloat(eye, "translationX", 200f).apply {
                duration = 2000
                start()
            }
        }

        val button2: Button = findViewById(R.id.left)
        button2.setOnClickListener{
            ObjectAnimator.ofFloat(eye, "translationX", -200f).apply {
                duration = 2000
                start()
            }
        }

        
    }



}
