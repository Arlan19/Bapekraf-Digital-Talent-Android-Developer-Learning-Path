package com.arlanallacsta.kotlin.FundamentalDanControlFlow

data class User (val name: String, val age: Int)

fun main() {

    //listOf

//    val anyList = listOf('a', "Kotlin", 3, true)
//    println(anyList)

    //mutableListof

    val anyList = mutableListOf('a', "Kotlin", 3, true, User("normal",12))

    anyList.add('d') // menambah item di akhir list
    anyList.add(1, "love") // menambah item pada indeks ke-1
    anyList[3] = false // mengubah nilai item pada indeks ke-3
    anyList.removeAt(0) // menghapus item pada indeks ke-0

    println(anyList)
}