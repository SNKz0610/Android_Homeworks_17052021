package com.snkz.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.snkz.databinding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private var tag: String = "WelcomeActivity"
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        var snkz = Profile("Đô Anh", "Astralis", "Hà Nội", 10, 0, 1)
        mainBinding.binding = snkz
        mainBinding.btnShownumber.setOnClickListener {
            if (mainBinding.groupInformation.visibility == View.GONE) {
                mainBinding.groupInformation.visibility = View.VISIBLE
                mainBinding.btnShownumber.text = "Hide information"

            } else {
                mainBinding.groupInformation.visibility = View.GONE
                mainBinding.btnShownumber.text = "Show information"
            }

        }
    }


    override fun onResume() {
        super.onResume()
        Log.d(tag, "onResume")
        Toast.makeText(this, "❤ Welcome Back ❤", Toast.LENGTH_LONG).show()
    }
}