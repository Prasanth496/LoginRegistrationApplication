package com.example.loginregistrationapplication.model


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


}