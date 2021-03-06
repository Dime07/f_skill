package com.example.percobaan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener {
            startActivity(Intent(this, login::class.java))
        }

        btn_tutor.setOnClickListener {
            startActivity(Intent(this, daftar_tutor::class.java))
        }

        btn_daftar.setOnClickListener {
            startActivity(Intent(this, Halo::class.java))
        }
    }
}
