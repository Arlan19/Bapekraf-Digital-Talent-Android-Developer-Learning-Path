package com.arlanallacsta.kotlin.ObjectOrientedProgramming

//fun main() {
//    val objectEverywahre = "object dimana-mana"
//    println(objectEverywahre.reversed())
//    println(objectEverywahre.uppercase())
//    println(objectEverywahre.lowercase())
//}

fun main() {
    val someString = "123"
    val someInt = someString.toInt()
    val someOtherString = "12.34"
    val someDouble = someOtherString.toDouble()

    println(someInt is Int)
    println(someDouble is Double)
}