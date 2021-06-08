package com.snkz.databinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.snkz.databinding.databinding.ActivityMainBinding
import com.snkz.databinding.databinding.ActivityShowNameBinding

class ShowNameActivity : AppCompatActivity() {
    private var tag: String = "ShowActivity"
    private lateinit var showNameBinding: ActivityShowNameBinding
    private var name: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showNameBinding = DataBindingUtil.setContentView(this, R.layout.activity_show_name)
        name = "Welcome " +intent.getStringExtra("user_name").toString()+ " 👋"
        var snkz = Profile("$name", "Astralis", "Hà Nội", 10, 0, 1)
        showNameBinding.binding2 = snkz

        showNameBinding.btnBack.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}