package com.example.cinelaser

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var titles = arrayOf(
        "The Last Kingdom",
        "Game Of Thrones",
        "Vikings",
        "The 12 Princess Ballerinas",
        "The Princess and the Commoner",
        "the Diamond Castle",
        " The Swan Lake",
        "Barbie Fairy Secret"
    )
    private var images = intArrayOf(
        R.drawable.imagetlk,
        R.drawable.imagegot,
        R.drawable.imagevikings,
        R.drawable.imageb12,
        R.drawable.imagebpp,
        R.drawable.imagebcd,
        R.drawable.imageblgc,
        R.drawable.imagebsf
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.movies_item, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView = itemView.findViewById(R.id.item_image)
        var itemTitle: TextView = itemView.findViewById(R.id.item_title)
    }
}