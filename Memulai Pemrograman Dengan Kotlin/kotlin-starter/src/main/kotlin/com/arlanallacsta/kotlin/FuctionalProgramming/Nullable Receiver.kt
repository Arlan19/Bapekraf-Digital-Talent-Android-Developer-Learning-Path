package com.arlanallacsta.kotlin.FuctionalProgramming

fun main() {
    val value: Int? = null
    val valueNonNull : Int? = 8

    println(value.slice)

    println(valueNonNull.slice)
}

val Int?.slice: Int
    get() = this?.div(2) ?: 0
