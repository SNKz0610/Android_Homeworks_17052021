package com.snkz.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.snkz.databinding.databinding.ActivityMainBinding

data class Profile(val name : String, val company : String, val address : String, val numberPics : Int, val numberFollowrer : Int, val numberFollows : Int)

class MainActivity : AppCompatActivity() {
    private val snkz = Profile("Đô Anh", "Astralis", "Hà Nội", 10, 0, 1)
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.tvName.text = "${snkz.name}"
        binding.tvSchool.text = "${snkz.company}"
        binding.tvCountry.text = "${snkz.address}"
        binding.tvNumberofphotos.text = "${snkz.numberPics}"
        binding.tvNumberoffollowers.text = "${snkz.numberFollowrer}"
        binding.tvNumberoffollows.text = "${snkz.numberFollows}"
    }
}