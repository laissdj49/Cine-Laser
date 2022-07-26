package com.example.cinelaser

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cinelaser.databinding.SuccessBinding

class SuccessBuyingTicketActivity : AppCompatActivity() {

    private val binding by lazy { SuccessBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        //val price = intent.getStringExtra("total")
        //println(price)
        //binding.totalPrice.text = price
       val txt = intent.getStringExtra("text")
        val tickets = intent.getIntExtra("tickets", 0)
        println(txt)
        binding.textView4.text = "você teve sucesso na compra de $tickets ingresso(s) para o filme $txt"

        binding.myTicket.setOnClickListener {
            val intent = Intent(this, ScreenTicketActivity::class.java)
            intent.putExtra("title", txt)
            intent.putExtra("ticket", tickets)
            startActivity(intent)
        }
        binding.screenMovie.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }
    }
}