package com.example.loginregistrationapplication.viewmodel

import android.text.TextUtils
import android.util.Patterns
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.example.loginregistrationapplication.model.User


class LoginViewModel : BaseObservable() {

    private var user: User? = null
    private val successMessage = "Login was successful"
    private val errorMessage = "Email or Password not valid"

    @Bindable
    private val toastMessage: String? = null

    fun getToastMessage(): String? {
        return toastMessage
    }

    private fun setToastMessage(toastMessage: String) {
        this.toastMessage = toastMessage
        notifyPropertyChanged(toastMessage)
    }


    fun setUserEmail(email: String?) {
        user!!.email = email!!
        notifyPropertyChanged(userEmail)
    }

    @Bindable
    fun getUserEmail(): String? {
        return user!!.email
    }

    @Bindable
    fun getUserPassword(): String {
        return user!!.password
    }

    fun setUserPassword(password: String?) {
        user!!.password = password!!
        notifyPropertyChanged(userPassword)
    }

    fun LoginViewModel() {
        user = User("", "")
    }

    fun onLoginClicked() {
        if (isInputDataValid()) setToastMessage(successMessage) else setToastMessage(errorMessage)
    }

    fun isInputDataValid(): Boolean {
        return !TextUtils.isEmpty(getUserEmail()) && Patterns.EMAIL_ADDRESS.matcher(getUserEmail()).matches() && getUserPassword().length > 5
    }

}