package com.arlanallacsta.kotlin.FuctionalProgramming

//Extension Functions

//fun main() {
//    10.printInt()
//}
//
//fun Int.printInt() {
//    print("value $this")
//}


//fun main() {
//    println(10.plusThree())
//}
//
//fun Int.plusThree():Int{
//    return this + 3
//}

// Extentsion Properties

fun main() {
    println(10.slice)
}

val Int.slice: Int
    get() = this / 2