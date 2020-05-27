package com.example.percobaan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mou.*
import kotlinx.android.synthetic.main.activity_mou.toolbar
import kotlinx.android.synthetic.main.activity_pilihkbk.*

class mou : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mou)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btn_daftar5.setOnClickListener {
            startActivity(Intent(this, homepage::class.java))
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
