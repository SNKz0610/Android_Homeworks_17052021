package com.snkz.appkhaibaoyte

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.snkz.appkhaibaoyte.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var tag: String = "MainActivity"
    private lateinit var mainBinding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        var person = User("", "", "", "", "", "", "")
        mainBinding.bindingmainactiviTy = person

        submit()
    }

    fun getSex() : String {
        val idSex : Int = mainBinding.groupradioMainactivitySex.checkedRadioButtonId
        val radioButton1 : RadioButton = findViewById(idSex)
        var sex : String = ""

        if(radioButton1.text.toString().equals("Nam")){
            sex = "Nam"
        } else {
            sex = "Nữ"
        }
        return sex
    }

    fun getStatus() : String {
        val idStatus : Int = mainBinding.groupradioMainactivityCheckmeeeting.checkedRadioButtonId
        val radioButton2 : RadioButton = findViewById(idStatus)
        var status : String = ""

        if(radioButton2.text.toString().equals("Clear")){
            status = "Clear"
        } else {
            status = "Đã tiếp xúc với 1 trong số các bệnh nhân F1 /F2 /F3"
        }

        return status
    }


    fun  getInformation(): User? {
        val name : String = mainBinding.edittextMainactivityName.text.toString()
        val birthday : String = mainBinding.edittextMainactivityDob.text.toString()
        val sex : String = getSex()
        val address : String = mainBinding.edittextMainactivityAddress.text.toString()
        val phone : String = mainBinding.edittextMainactivityPhone.text.toString()
        val travel : String = mainBinding.edittextMainactivityTravel.text.toString()
        val status : String = getStatus()

        if(!name.isEmpty() && !birthday.isEmpty() && !phone.isEmpty() && !address.isEmpty() && !travel.isEmpty()){
            val user = User(name, birthday, sex, address, phone, travel, status)
            return user
        }
        return null
    }

    fun submit() {
        mainBinding.buttonActivitmainSubmit.setOnClickListener {
            val intent : Intent = Intent(this@MainActivity, ShowInformationActivity::class.java)
            val user : User? = getInformation()
            if (user == null){
                Toast.makeText(this, "⛔ Vui lòng điền đầy đủ thông tin! ⛔", Toast.LENGTH_LONG).show()
            } else {

                intent.putExtra("user", user)
                startActivity(intent)
                Toast.makeText(this@MainActivity, "🎉 SUBMIT INFORMATION SUCCESS! 🎉", Toast.LENGTH_LONG).show()
            }
        }
    }

}