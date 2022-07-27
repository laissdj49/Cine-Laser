package com.example.cinelaser

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cinelaser.databinding.ActivityScreenTicketBinding

class ScreenTicketActivity : AppCompatActivity() {
    private val binding by lazy { ActivityScreenTicketBinding.inflate(layoutInflater) }
    private var layoutManager: RecyclerView.LayoutManager? = null
    private val viewModel by lazy { ListViewModel() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager

        val ticket = intent.getIntExtra("ticket", 0)
        val movieTitle = intent.getStringExtra("title") ?: "não encontrado"
        
        val listTicket = List(size = ticket) { movieTitle }
        binding.recyclerView.adapter = RecyclerAdaptercard(listTicket)
    }
}