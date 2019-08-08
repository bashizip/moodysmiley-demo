package com.bashizip.moddysmiley

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bashizip.moodysmiley.SmileyView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val moodySmiley = findViewById<SmileyView>(R.id.moody_smiley)
        moodySmiley.moody = true
    }
}
