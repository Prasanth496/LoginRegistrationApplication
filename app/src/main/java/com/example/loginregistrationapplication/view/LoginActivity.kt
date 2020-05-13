package com.example.loginregistrationapplication.view

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.BindingAdapter
import com.example.loginregistrationapplication.R


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    @BindingAdapter("toastMessage")
    fun runMe(view: View, message: String?) {
        if (message != null) Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show()
    }
}
