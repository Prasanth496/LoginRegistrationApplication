package com.example.loginregistrationapplication.view

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProviders
import com.example.loginregistrationapplication.R
import com.example.loginregistrationapplication.model.User
import com.example.loginregistrationapplication.viewmodel.LoginViewModel
import com.example.loginregistrationapplication.viewmodel.LoginViewModelImpl


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var binding : ViewDataBinding? = DataBindingUtil.setContentView<ViewDataBinding>(this,R.layout.activity_login)
        var loginViewModel : LoginViewModel = ViewModelProviders.of(this, LoginViewModelImpl(this, User())).get(LoginViewModel.class)

    }

}
