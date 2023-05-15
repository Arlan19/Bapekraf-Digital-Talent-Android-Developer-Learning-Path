package com.arlanallacsta.kotlin.Generic

fun <T : Number> printNumber(value: T) {
    println(value)
}

fun <T : Comparable<T>> getMax(a: T, b: T): T {
    return if (a > b) a else b
}

fun <T : CharSequence> printLength(value: T) {
    println(value.length)
}

fun main() {
    printNumber(10)
    printNumber(3.14)


    val maxInt = getMax(10, 5)
    val maxString = getMax("Hello", "World")

    printLength("Hello")
    printLength(StringBuilder("World"))
}

