package com.arlanallacsta.kotlin.FuctionalProgramming

// Named Argument

//fun main() {
//    //val fullName = getFullName(first = "Kotlin" , middle = " is ", last = "Awesome")
//    val fullName = getFullName(middle = " is " , first = "Kotlin", last = "Awesome")
//    print(fullName)
//}
//
//fun getFullName(first: String, middle: String, last: String): String {
//    return "$first $middle $last"
//}

// Default Argument

fun main() {
    val fullName = getFullName("Dicoding")
    print(fullName)
}

fun getFullName(
    first: String = "Kotlin",
    middle: String = " is ",
    last: String = "Awesome"): String {
    return "$first $middle $last"
}