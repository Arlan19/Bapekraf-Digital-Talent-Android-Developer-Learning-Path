package com.arlanallacsta.kotlin.Corotines

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

//fun main() = runBlocking(CoroutineName("main")) {
//    val channel = Channel<Int>()
//    launch(CoroutineName("v1coroutine")){
//        println("Sending from ${Thread.currentThread().name}")
//        for (x in 1..5) channel.send(x * x)
//    }
//
//    repeat(5) { println(channel.receive()) }
//    println("received in ${Thread.currentThread().name}")
//}

fun main() {
    val total = listOf(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
    val result1 = total.distinct()
    val result2 = result1.slice(1..3)
    println(result2)
}