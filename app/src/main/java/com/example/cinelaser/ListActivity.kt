package com.example.cinelaser

import android.content.Intent
import android.os.Bundle
import android.service.quicksettings.Tile
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cinelaser.databinding.ActivityListMoviesBinding
import com.example.cinelaser.model.Movie

class ListActivity : AppCompatActivity() {
    private val binding by lazy { ActivityListMoviesBinding.inflate(layoutInflater) }

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null
    private val viewModel by lazy { ListViewModel() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager
        val movies = viewModel.listMovies()
        adapter = RecyclerAdapter(
            movies = movies,
            onClick = ::onClickGoToNextScreen
        )

        binding.recyclerView.adapter = adapter
    }

    private fun onClickGoToNextScreen(movie: Movie) {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("text", movie.title)
        startActivity(intent)
    }
}