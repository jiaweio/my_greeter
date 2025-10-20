package com.example.my_greeter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //test my greeter
        val greeter = MyGreeter()
        println(greeter.greeting())

        val morning = MyGreeter(timeProvider = { 9 })
        println(morning.greeting()) // println Good morning
    }
}