package com.example.cinelaser

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.cinelaser.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val vm = MainActivityViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        updatePayButton()
        with(binding) {
            val list = listOf(
                listOf(button1, button2, button3, button4),
                listOf(button5, button6, button7, button8),
                listOf(button9, button10, button11, button12),
                listOf(button13, button14, button15, button16),
                listOf(button17, button18, button19, button20),
                listOf(button21, button22, button23, button24)
            )
            for (i in 0..5) {
                for (j in 0..3) {
                    var isSelected = false
                    list[i][j].setOnClickListener {
                        isSelected = if (isSelected) {
                            list[i][j].setBackgroundColor(getColor(R.color.Blue))
                            vm.removeSeatOfTotalToPay(i+1, 6)
                            false
                        } else {
                            list[i][j].setBackgroundColor(getColor(R.color.Red))
                            vm.addSeatToTotalToPay(i+1, 6)
                            true
                        }

                        updatePayButton()
                    }
                }
            }
        }

        binding.buy.setOnClickListener {
            val intent = Intent(this, SuccessBuyingTicketActivity::class.java)
            intent.putExtra("total", vm.getTotalFormatted())
            startActivity(intent)
        }
    }

    private fun updatePayButton(){
        binding.buy.isEnabled = vm.canProceedToPay()
    }
}