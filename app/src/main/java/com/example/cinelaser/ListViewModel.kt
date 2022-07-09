package com.example.cinelaser

import androidx.lifecycle.ViewModel
import com.example.cinelaser.model.Movie

class ListViewModel : ViewModel() {

    fun listMovies(): List<Movie> {
        return listOf(
            Movie("The Last Kingdom", R.drawable.imagetlk),
            Movie("Game Of Thrones", R.drawable.imagegot),
            Movie("Vikings", R.drawable.imagevikings),
            Movie("The 12 Princess Ballerinas", R.drawable.imageb12),
            Movie("The Princess and the Commoner", R.drawable.imagebpp),
            Movie("The Diamond Castle", R.drawable.imagebcd),
            Movie("The Swan Lake", R.drawable.imageblgc),
            Movie("Barbie Fairy Secret", R.drawable.imagebsf),
        )
    }


}