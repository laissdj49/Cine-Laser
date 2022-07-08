package com.example.cinelaser

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.example.cinelaser.databinding.ActivityFirstBinding

class LoginActivity : AppCompatActivity() {

    private val binding by lazy { ActivityFirstBinding.inflate(layoutInflater) }

    private val viewModel by lazy { LoginViewModel() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        updateLoginButton()


        with(binding) {

            editTextNumberPassword.addTextChangedListener {
                updateLoginButton()

            }

            textTextEmail.addTextChangedListener {
                updateLoginButton()
            }
            buttonLogin.setOnClickListener {
                val intent = Intent(applicationContext, ListActivity::class.java)
                startActivity(intent)
            }
            buttonContinue.setOnClickListener {
                val intent = Intent(applicationContext, ListActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun updateLoginButton() {
        with(binding) {
            val email = textTextEmail.text.toString()
            val password = editTextNumberPassword.text.toString()
            buttonLogin.isEnabled = viewModel.validate(email = email, password = password)

            }
        }
    }

