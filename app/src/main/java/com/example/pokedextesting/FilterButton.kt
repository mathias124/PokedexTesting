package com.example.pokedextesting

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class FilterButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.filterbutton_activity)
        val garfield = findViewById<ImageView>(R.id.garfield)
    }
}