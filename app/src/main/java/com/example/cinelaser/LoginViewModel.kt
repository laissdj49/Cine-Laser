package com.example.cinelaser

import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    fun validate(email: String, password: String) : Boolean {
        return email.isNotEmpty() && password.isNotEmpty()
    }

}