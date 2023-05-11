package com.arlanallacsta.kotlin.FuctionalProgramming

// let

//fun main() {
//    val message: String? = null
//    message?.let {
//        val length = it.length * 2
//        val text = "text length $length"
//        println(text)
//    }
//}

//fun main() {
//    val message: String? = null
//    val length = message?.length ?: 0 * 2
//    val text = "text length $length"
//    println(text)
//}

//fun main() {
//    val message: String? = null
//    message?.let {
//        val length = it.length * 2
//        val text = "text length $length"
//        println(text)
//    } ?: run {
//        val text = "message is null"
//        println(text)
//    }
//}

// also

fun main() {
    val text = "Hello Kotlin"
    val result = text.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")
}