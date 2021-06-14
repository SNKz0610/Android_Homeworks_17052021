package com.snkz.appkhaibaoyte

import java.io.Serializable

data class User(val name: String, val dob: String, val sex: String, val address: String, val phone
: String, val travel: String, val status: String) : Serializable {}
