package com.allacsta.recycleviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvUser : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvUser = findViewById(R.id.rv_heroes)
        rvUser.layoutManager = LinearLayoutManager(this)


        val dataName = resources.getStringArray(R.array.name)
        val dataDescription = resources.getStringArray(R.array.description)
        val dataPhoto = resources.obtainTypedArray(R.array.avatar)
        val listHero = ArrayList<Hero>()
        for (i in dataName.indices) {
            val hero = Hero(dataName[i],dataDescription[i], dataPhoto.getResourceId(i, -1))
            listHero.add(hero)
        }

        rvUser.adapter = ListUserAdapter(listHero)
    }
}