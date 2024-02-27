package com.example.designtry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //in coding part R-> res directory
        //in xml part @-> res directory

        //width = wrap_content -> self
        //width = match_parent -> environment
        //0dp -> match constraint
    }
}