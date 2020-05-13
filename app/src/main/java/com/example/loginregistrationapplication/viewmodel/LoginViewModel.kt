package com.example.loginregistrationapplication.viewmodel

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.loginregistrationapplication.model.User

class LoginViewModel(private var context: Context,  var user: User) : ViewModel() {

    public var email : MutableLiveData<String> = MutableLiveData()
    public var password : MutableLiveData<String> = MutableLiveData()

    fun onLoginClick(){
    }

}