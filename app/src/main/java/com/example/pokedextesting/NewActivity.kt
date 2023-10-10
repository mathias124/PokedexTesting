package com.example.pokedextesting

import android.content.Intent
import android.graphics.drawable.Icon
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_activity)


        val buttonImage = findViewById<ImageButton>(R.id.imageButton)
        buttonImage.setOnClickListener {
            val intent = Intent(this, IconB::class.java)
            startActivity(intent)
        }
    }
}