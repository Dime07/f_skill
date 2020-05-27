package com.example.percobaan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class homepage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.akun -> {
                    // Respond to navigation item 1 click
                    true
                }
                R.id.buku -> {
                    // Respond to navigation item 2 click
                    true
                }
                R.id.belajar -> {
                    // Respond to navigation item 2 click
                    true
                }
                else -> false
            }
        }
    }
}
