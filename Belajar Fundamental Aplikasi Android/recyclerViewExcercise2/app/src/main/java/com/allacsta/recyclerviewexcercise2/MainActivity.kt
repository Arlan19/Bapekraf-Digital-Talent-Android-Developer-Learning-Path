package com.allacsta.recyclerviewexcercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvGitUser : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvGitUser = findViewById(R.id.rv_git)
        rvGitUser.layoutManager = LinearLayoutManager(this)

        val dataName = resources.getStringArray(R.array.name)
        val dataUserName = resources.getStringArray(R.array.username)
        val dataAvatar = resources.obtainTypedArray(R.array.avatar)
        val listGitUser = ArrayList<githubUser>()
        for (i in dataName.indices){
            val user = githubUser(dataName[i], dataUserName[i], dataAvatar.getResourceId(i, -1))
            listGitUser.add(user)
        }

        rvGitUser.adapter = githubUserAdapter(listGitUser)


    }
}