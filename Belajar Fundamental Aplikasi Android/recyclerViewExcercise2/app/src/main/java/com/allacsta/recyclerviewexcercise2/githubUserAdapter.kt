package com.allacsta.recyclerviewexcercise2

import android.icu.text.Transliterator.Position
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class githubUserAdapter(private val listArray: ArrayList<githubUser>)
    :RecyclerView.Adapter<githubUserAdapter.mygithubUser>() {

    class mygithubUser(itemView: View):RecyclerView.ViewHolder(itemView) {
        var img_Holder: ImageView = itemView.findViewById(R.id.img_item_avatar)
        var tv_name: TextView = itemView.findViewById(R.id.tv_item_name)
        var tv_username: TextView = itemView.findViewById(R.id.tv_item_username)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mygithubUser {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_git, parent, false)
        return mygithubUser(view)
    }

    override fun onBindViewHolder(holder: mygithubUser, position: Int) {
        val (name, username, avatar) = listArray[position]
        holder.tv_name.text = name
        holder.tv_username.text = username
        holder.img_Holder.setImageResource(avatar)

    }

    override fun getItemCount(): Int = listArray.size
}