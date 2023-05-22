package com.allacsta.recycleviewexcercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.allacsta.recycleviewexcercise.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //    private lateinit var rvUser : RecyclerView
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        rvUser = findViewById(R.id.rv_user)
//        rvUser.layoutManager = LinearLayoutManager(this)
//
//        val dataName = resources.getStringArray(R.array.name)
//        val dataUsername = resources.getStringArray(R.array.username)
//        val dataAvatar = resources.obtainTypedArray(R.array.avatar)
//        val dataRepo = resources.getStringArray(R.array.repository)
//        val listUser = ArrayList<User>()
//        for (i in dataName.indices){
//            val user = User(dataName[i], dataUsername[i],dataAvatar.getResourceId(i, -1), dataRepo[i])
//            listUser.add(user)
//        }
//
//        rvUser.adapter = UserAdapter(listUser)

        binding.apply {
            rvUser.layoutManager = LinearLayoutManager(this@MainActivity)

            val dataName = resources.getStringArray(R.array.name)
            val dataUsername = resources.getStringArray(R.array.username)
            val dataAvatar = resources.obtainTypedArray(R.array.avatar)
            val dataRepo = resources.getStringArray(R.array.repository)
            val listUser = ArrayList<User>()
            for (i in dataName.indices) {
                val user =
                    User(dataName[i], dataUsername[i], dataAvatar.getResourceId(i, -1), dataRepo[i])
                listUser.add(user)
            }

            rvUser.adapter = UserAdapter(listUser)
        }
    }
}