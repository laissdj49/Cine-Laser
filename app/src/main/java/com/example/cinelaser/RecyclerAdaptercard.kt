package com.example.cinelaser

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdaptercard(val titles: List<String>) :
    RecyclerView.Adapter<RecyclerAdaptercard.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerAdaptercard.ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.tickets_item, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: RecyclerAdaptercard.ViewHolder, position: Int) {
        holder.itemTitlemovie.text = titles[position]

    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemTitlemovie: TextView
        val itemTicket: TextView
        val itemSeat: TextView

        init {
            itemTitlemovie = itemView.findViewById(R.id.item_titleMovie)
            itemTicket = itemView.findViewById(R.id.item_ticket)
            itemSeat = itemView.findViewById(R.id.item_seat)
        }
    }


}
