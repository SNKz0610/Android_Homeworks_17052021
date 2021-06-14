package com.snkz.appkhaibaoyte

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.snkz.appkhaibaoyte.databinding.ActivityShowInformationBinding

class ShowInformationActivity : AppCompatActivity() {
    private lateinit var showBinding : ActivityShowInformationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showBinding = DataBindingUtil.setContentView(this,R.layout.activity_show_information)

        setInformation()
        back()
    }

    fun setInformation() {
        val user : User = intent.getSerializableExtra("user") as User

        var name = "👉 Họ và tên: " + user.name
        var birthday = "👉 Ngày sinh: " + user.dob
        var sex = "👉 Giới tính: " + user.sex
        var address = "👉 Địa chỉ: " + user.address
        var phone = "👉 Số điện thoại: " + user.phone
        var travel = "👉 Những nơi đã đi: \n" + user.travel
        var status = "👉 Trạng thái: \n" + user.status

        var information : String ="$name \n\n$birthday \n\n$sex \n\n$address \n\n$phone \n\n$travel \n\n$status"

        showBinding.textviewActivityshowDocument.text = information
    }

    fun back() {
        showBinding.buttonActivityshowBack.setOnClickListener {
            val intent : Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}