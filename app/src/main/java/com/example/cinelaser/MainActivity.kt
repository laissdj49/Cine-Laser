package com.example.cinelaser

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.cinelaser.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var cont = 0

    private val binding by lazy {  ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        with(binding) {
            val list = listOf<List<Button>>(
                listOf(button1, button2, button3, button4),
                listOf(button5, button6, button7, button8),
                listOf(button9, button10, button11, button12),
                listOf(button13, button14, button15, button16),
                listOf(button17, button18, button19, button20),
                listOf(button21, button22, button23, button24)
            )
            for (i in 0..5) {
                for (j in 0..3) {
                    list[i][j].setOnClickListener {
                        if (cont == 0) {
                            list[i][j].setBackgroundColor(getColor(R.color.Red))
                            cont = 1
                            binding.price.text = "Total a Pagar: R$${cont * 10}"
                        } else {
                            list[i][j].setBackgroundColor(getColor(R.color.Blue))
                            cont = 0
                        }
                    }
                }
            }
        }

        val purchase : Button = findViewById(R.id.buy)
        purchase.setOnClickListener {
          val intent = Intent(this, com.example.cinelaser.SuccessBuyingTicketActivity::class.java)
            intent.putExtra("total",binding.price.text)
            startActivity(intent)







        }


    }

}