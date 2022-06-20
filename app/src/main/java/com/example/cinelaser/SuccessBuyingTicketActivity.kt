package com.example.cinelaser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.cinelaser.databinding.ActivityMainBinding
import com.example.cinelaser.databinding.SuccessBinding

class SuccessBuyingTicketActivity : AppCompatActivity() {

    private val binding by lazy {  SuccessBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val price = intent.getStringExtra("total")
           println(price)
          binding.totalPrice.text = price
}
}