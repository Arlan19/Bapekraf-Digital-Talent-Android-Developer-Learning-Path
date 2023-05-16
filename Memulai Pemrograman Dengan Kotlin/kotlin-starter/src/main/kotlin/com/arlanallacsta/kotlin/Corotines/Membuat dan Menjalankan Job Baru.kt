package com.arlanallacsta.kotlin.Corotines

import kotlinx.coroutines.*

//fun main() = runBlocking {
//    val job = launch(start = CoroutineStart.LAZY) {
//        delay(1000L)
//        println("Start new job!")
//    }
//
//    job.start()
//    println("Other task")
//}

fun main() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }

    job.join()
    println("Other task")
}