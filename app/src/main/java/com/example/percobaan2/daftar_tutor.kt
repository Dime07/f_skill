package com.example.percobaan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_daftar_tutor.*

class daftar_tutor : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_tutor)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btn_daftar3.setOnClickListener {
            startActivity(Intent(this, pilihkbk::class.java))
        }
    }
        override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
