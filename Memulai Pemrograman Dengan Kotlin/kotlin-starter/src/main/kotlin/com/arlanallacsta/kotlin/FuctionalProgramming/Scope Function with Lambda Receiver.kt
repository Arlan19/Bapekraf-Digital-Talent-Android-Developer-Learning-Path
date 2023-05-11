package com.arlanallacsta.kotlin.FuctionalProgramming

// run

//fun main() {
//    val text = "Hello"
//    val result = text.run {
//        val from = this
//        val to = this.replace("Hello", "Kotlin")
//        "replace text from $from to $to"
//    }
//
//    println("result : $result")
//}

// with

//fun main() {
//    val message = "Hello Kotlin!"
//    val result = with(message) {
//        println("value is $this")
//        println("with length ${this.length}")
//    }
//}
//fun main() {
//    val message = "Hello Kotlin!"
//    val result = with(message) {
//        "First character is ${this[0]}" +
//                " and last character is ${this[this.length - 1]}"
//    }
//
//    println(result)
//}

// apply

//fun main() {
//    val builder = StringBuilder()
//    builder.append("Hello ")
//    builder.append("Kotlin!")
//
//    println(builder.toString())
//}

fun main() {
    val message = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(message.toString())
}