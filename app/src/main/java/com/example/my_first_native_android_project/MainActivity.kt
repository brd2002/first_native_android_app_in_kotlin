package com.example.my_first_native_android_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.my_first_native_android_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // using the same function with more
    // its connect xml with the kotlin and xml convert in java file
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        // connect xml code with kotlin code
        binding.textTitle.text = "App of tomorrow"
    }
}