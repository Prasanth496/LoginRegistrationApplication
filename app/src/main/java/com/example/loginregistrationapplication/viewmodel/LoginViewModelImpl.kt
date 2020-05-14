package com.example.loginregistrationapplication.viewmodel

import android.content.Context
import androidx.annotation.NonNull
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.loginregistrationapplication.model.User
import com.example.loginregistrationapplication.view.LoginActivity

class LoginViewModelImpl(loginActivity: LoginActivity, user: User) : ViewModelProvider.Factory {

    private lateinit var user : User
    private lateinit var context : Context

    override fun <T : ViewModel?> create(modelClass: Class<T>) : T {
        return T
    }
}
