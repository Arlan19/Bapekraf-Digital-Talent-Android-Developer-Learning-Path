package com.allacsta.recycleviewexcercise

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(private val listUser: ArrayList<User>)
    : RecyclerView.Adapter<UserAdapter.myUserAdapter>(){
    class myUserAdapter(itemView: View) :RecyclerView.ViewHolder(itemView) {
        var imgAvatar: ImageView = itemView.findViewById(R.id.img_item_avatar)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvUsername: TextView = itemView.findViewById(R.id.tv_item_username)
        var tvRepo : TextView = itemView.findViewById(R.id.repository)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myUserAdapter {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return myUserAdapter(view)
    }

    override fun onBindViewHolder(holder: myUserAdapter, position: Int) {
        val ( name, username,avatar, repo) = listUser[position]
        holder.tvName.text = name
        holder.tvUsername.text = username
        holder.imgAvatar.setImageResource(avatar)
        holder.tvRepo.text = repo

    }

    override fun getItemCount(): Int = listUser.size
}

/*
    1.  UserAdapter adalah kelas adaptor yang menerima parameter berupa daftar User yang akan ditampilkan dalam RecyclerView.
    2.  myUserAdapter adalah kelas ViewHolder yang digunakan untuk menyimpan referensi ke elemen tampilan di dalam setiap
        item dalam RecyclerView. Di sini, ada empat properti yaitu imgAvatar (ImageView), tvName (TextView), tvUsername
        (TextView), dan tvRepo (TextView). Properti-properti ini akan digunakan untuk mengakses dan mengatur nilai-nilai
        elemen tampilan di setiap item.
    3.  Fungsi onCreateViewHolder digunakan untuk membuat instance myUserAdapter baru. Itu menginflasikan layout item_user
        menggunakan LayoutInflater dan mengembalikan instance myUserAdapter dengan view yang diinflate sebagai itemView.
    4.  Fungsi onBindViewHolder dipanggil oleh RecyclerView untuk menampilkan data pada posisi tertentu dalam ViewHolder
        yang ditentukan. Di sini, data User pada posisi yang sesuai diambil dari listUser, dan nilai-nilai properti
        ViewHolder diisi dengan data yang relevan.
    5.  Fungsi getItemCount mengembalikan jumlah item dalam daftar listUser, yang akan menentukan berapa banyak item yang
        akan ditampilkan dalam RecyclerView.

    Dengan menggunakan kelas UserAdapter ini, Anda dapat menghubungkan data User ke RecyclerView untuk menampilkan daftar
    pengguna dengan tata letak item_user.
 */