package com.example.my_first_native_android_project

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
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


        binding.buttonSetImage.setOnClickListener {
            Glide
                .with(this) //auto matically gives you context
                .load("https://cdn.pixabay.com/photo/2023/12/06/08/41/mountain-8433234_1280.jpg")
            .centerCrop()
//            .placeholder(R.drawable.loading_spinner)
                .into(binding.imageDownloaded);
//            binding.textTitle.text = "Set Image Successful"
//            binding.imageDownloaded.setImageDrawable(ContextCompat.getDrawable(this , R.drawable.another_wallpaper))
        }
    }
}