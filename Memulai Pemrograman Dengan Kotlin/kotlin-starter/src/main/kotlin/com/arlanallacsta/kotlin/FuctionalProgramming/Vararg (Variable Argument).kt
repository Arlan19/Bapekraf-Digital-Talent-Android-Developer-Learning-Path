package com.arlanallacsta.kotlin.FuctionalProgramming

//fun main() {
//    val listNumber = sumNumber(1,2,2,3,4,5,5)
//    println(listNumber)
//}
//
//fun sumNumber(vararg number: Int): Int{
//    return number.sum()
//}

fun main() {
    val number = intArrayOf(10, 20, 30, 40)
    sets(10, 20, 20, *number , 10)
}

fun sets(vararg number: Int): Int {
    return  number.sum()
}