package com.arlanallacsta.kotlin.FuctionalProgramming

fun main() {
    val lenght = printMassage("Hello From Lambda")
    println("panjang massege adalah $lenght")
}

val printMassage = { massage : String -> massage.length}