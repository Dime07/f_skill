package com.example.percobaan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class pilihkbk : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilihkbk)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
