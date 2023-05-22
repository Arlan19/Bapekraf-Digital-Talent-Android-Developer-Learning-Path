package com.allacsta.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListHeroAdapter(
    private val listHero: ArrayList<Hero>
    ) : RecyclerView.Adapter<ListHeroAdapter.LisViewHolder>() {

    class LisViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDescription: TextView = itemView.findViewById(R.id.tv_item_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LisViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_hero, parent, false)
        return LisViewHolder(view)
    }

    override fun onBindViewHolder(holder: LisViewHolder, position: Int) {
        val (name, description, photo) = listHero[position]
        holder.imgPhoto.setImageResource(photo)
        holder.tvName.text = name
        holder.tvDescription.text = description
    }

    override fun getItemCount(): Int = listHero.size
}