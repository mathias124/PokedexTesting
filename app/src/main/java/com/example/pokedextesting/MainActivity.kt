package com.example.pokedextesting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pokedextesting.NewActivity
import com.example.pokedextesting.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick = findViewById<Button>(R.id.button_click)
        buttonClick.setOnClickListener {
            val intent = Intent(this, NewActivity::class.java)
            startActivity(intent)
}
            val filterButtonClick = findViewById<Button>(R.id.filterbutton_click)
            filterButtonClick.setOnClickListener {
                val intentFilter = Intent(this, FilterButton::class.java)
                startActivity(intentFilter)
            }
        }
    }
