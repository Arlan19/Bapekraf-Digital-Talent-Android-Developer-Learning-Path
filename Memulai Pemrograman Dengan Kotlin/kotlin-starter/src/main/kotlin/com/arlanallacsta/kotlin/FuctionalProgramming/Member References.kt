package com.arlanallacsta.kotlin.FuctionalProgramming

// Function References

//fun main() {
//    val numbers = 1.rangeTo(10)
//    val evenNumbers = numbers.filter(::isEvenNumber)
//
//    println(evenNumbers)
//}
//
//fun isEvenNumber(number: Int) = number % 2 == 0

//fun main() {
//    val numbers = 1.rangeTo(10)
//    val evenNumbers = numbers.filter(Int::isEvenNumber)
//
//    println(evenNumbers)
//}
//
//fun Int.isEvenNumber() = this % 2 == 0

// Property References

//var message = "Kotlin"
//
//fun main() {
//    println(::message.name)
//    println(::message.get())
//
//    ::message.set("Kotlin Academy")
//
//    println(::message.get())
//}

val message = "Kotlin"

fun main() {
    println(::message.name)
    println(::message.get())

    // ::message.set("Kotlin Academy") <- Error : Unresolved reference.

    println(::message.get())
}