package com.example.demoprojectforbranchmergetesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        print("Deleted prev msg and now in second branch")
        print("Now let's do changes in this one")
    }
}