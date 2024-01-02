package com.example.my_first_native_android_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    // fuction / method ->
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    // no output and no input
    fun print(){
        println("Hello world")
    }
    // tekes input but not return anything
    fun print(text :String){
        println("hello world" + text)
    }
    fun sumOfNNumbers(num : Int) : Int{
        return num*(num+1)/2;
    }
}