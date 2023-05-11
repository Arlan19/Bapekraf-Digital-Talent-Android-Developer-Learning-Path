package com.arlanallacsta.kotlin.FuctionalProgramming

// Fold

//fun main() {
//    val numbers = listOf(1, 2, 7)
//    //gunakan foldRight() untuk melakukan proses iterasi dari indeks terakhir
//    val fold = numbers.fold(10) { item, current ->
//        println("current $current")
//        println("item $item")
//        println()
//        item + current
//    }
//
//    println("Fold result: $fold")
//}

// Drop

//fun main() {
//    val number = listOf(1, 2, 3, 4, 5, 6)
//    // gunakan dropLast() untuk memangkas dari indeks terakhir
//    val drop = number.drop(3)
//
//    println(drop)
//}

// Take

fun main() {
    val total = listOf(1, 2, 3, 4, 5, 6)

    // gunakan funsi takeLast() untuk menjalakan operasi dari posisi atau indeks terakhir
    val take = total.take(3)

    println(take)
}