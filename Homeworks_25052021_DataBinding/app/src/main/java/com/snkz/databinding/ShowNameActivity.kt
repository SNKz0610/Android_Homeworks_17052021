package com.snkz.databinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.snkz.databinding.databinding.ActivityMainBinding

class ShowNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_name)
        val btnBack : Button = findViewById(R.id.btn_back)
        val tvName : TextView = findViewById(R.id.tv_showname)
        val name : String? = intent.getStringExtra("name_user")
        tvName.setText("Welcome, $name 👋")
        btnBack.setOnClickListener {
            val intent : Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}