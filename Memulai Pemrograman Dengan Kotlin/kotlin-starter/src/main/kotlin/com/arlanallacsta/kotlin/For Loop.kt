package com.arlanallacsta.kotlin

//fun main() {
//    val ranges = 1..5
//    for (i in ranges){
//        println("value is $i!")
//    }
//}

//fun main() {
//    val ranges = 1.rangeTo(5)
//    for (i in ranges){
//        println("value is $i!")
//    }
//}

//fun main() {
//    val ranges = 1.rangeTo(10) step 3
//    for (i in ranges ){
//        println("value is $i!")
//    }
//}

//fun main() {
//    val ranges = 1.rangeTo(10) step 3
//    for ((index, value) in ranges.withIndex()) {
//        println("value $value with index $index")
//    }
//}

//fun main() {
//
//    val ranges = 1.rangeTo(10) step 3
//    ranges.forEachIndexed { index, value ->
//        println("value $value with index $index")
//    }
//}

fun main() {
    val ranges = 1.rangeTo(10) step 3
    ranges.forEachIndexed { index, _ ->
        println("index $index")
    }
}