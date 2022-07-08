package com.example.cinelaser

import androidx.lifecycle.ViewModel

@Suppress("UNREACHABLE_CODE")
class LoginViewModel : ViewModel() {


    fun validate(email: String, password: String): Boolean {
        return email.contains('@') && email.contains(".com") && password.length >= 8
    }
}
