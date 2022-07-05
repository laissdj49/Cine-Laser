package com.example.cinelaser

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cinelaser.model.Movie

class RecyclerAdapter(
    private val movies: List<Movie>,
    private val onClick: () -> Unit
) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.movies_item, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = movies[position].title
        holder.itemImage.setImageResource(movies[position].image)
        holder.itemView.setOnClickListener {
            onClick.invoke()
        }
    }

    override fun getItemCount(): Int  = movies.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView = itemView.findViewById(R.id.item_image)
        var itemTitle: TextView = itemView.findViewById(R.id.item_title)
    }
}