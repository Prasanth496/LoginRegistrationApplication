package com.example.loginregistrationapplication.model

import android.text.TextUtils
import android.util.Patterns


class User{
    private lateinit var email: String
    private lateinit var password: String

    fun getEmail() : String{
        return email
    }

    fun setEmail(email: String){
        this.email = email
    }

    fun getPassword() : String{
        return password
    }

    fun setPassword(password : String){
        this.password = password
    }

    fun isValid() : Boolean{
        if(this.email != null && TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            return true
        }
        else
            return false
    }


}