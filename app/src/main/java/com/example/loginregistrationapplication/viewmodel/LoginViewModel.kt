package com.example.loginregistrationapplication.viewmodel

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.loginregistrationapplication.model.User

class LoginViewModel(private var context: Context,  var user: User) : ViewModel() {

    public var email : MutableLiveData<String> = MutableLiveData()
    public var password : MutableLiveData<String> = MutableLiveData()

    fun onLoginClick(){
        email.getValue()?.let { user.setEmail(it) }
        password.getValue()?.let { user.setPassword(it) }

       Toast.makeText(context,user.getEmail(),Toast.LENGTH_LONG).show()
    }
}