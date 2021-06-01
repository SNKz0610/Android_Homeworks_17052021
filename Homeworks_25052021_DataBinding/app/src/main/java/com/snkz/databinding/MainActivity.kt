package com.snkz.databinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.snkz.databinding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private  var tag : String = "WelcomeActivity"
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
        val name : String = mainBinding.edtEntername.text.toString()
        mainBinding.edtEntername.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                mainBinding.btnEntername.isClickable = false
                mainBinding.btnEntername.setBackgroundColor(resources.getColor(R.color.red))
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                mainBinding.btnEntername.isClickable = true
                mainBinding.btnEntername.setBackgroundColor(resources.getColor(R.color.blue))
            }

            override fun afterTextChanged(s: Editable?) {
                val name : String = mainBinding.edtEntername.text.toString()
                if (name.isBlank()) {
                    mainBinding.btnEntername.isClickable = false
                    mainBinding.btnEntername.setBackgroundColor(resources.getColor(R.color.red))
                } else {
                    mainBinding.btnEntername.setOnClickListener {
                        val intent : Intent = Intent(this@MainActivity, ShowNameActivity::class.java)
                        intent.putExtra("name_user", name)
                        startActivity(intent)
                        Toast.makeText(this@MainActivity, "🎉 SENDING NAME SUCCESS! 🎉", Toast.LENGTH_LONG).show()
                    }
                }
            }

        })
    }


    override fun onResume() {
        super.onResume()
        Log.d(tag, "onResume")
        Toast.makeText(this, "❤ Welcome Back ❤", Toast.LENGTH_LONG ).show()
    }
}