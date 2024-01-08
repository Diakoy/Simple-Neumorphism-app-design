package com.example.neumorphismtraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neumorphismtraining.databinding.ActivityMainBinding
import android.content.Intent

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGoToActivity2.setOnClickListener {
            val intent = Intent(this , MainActivity2::class.java)
            startActivity(intent)

        }
    }
}