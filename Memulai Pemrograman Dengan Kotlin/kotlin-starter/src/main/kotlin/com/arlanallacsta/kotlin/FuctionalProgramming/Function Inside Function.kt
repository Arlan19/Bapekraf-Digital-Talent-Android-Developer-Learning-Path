package com.arlanallacsta.kotlin.FuctionalProgramming

fun main() {
//    setWord("Dicoding")

    print(sum(1,2,0))

}

//fun setWord(message: String){
//    fun printText(text : String){
//        println(text)
//    }
//
//    printText(message)
//}

//fun setWord(message: String) {
//    fun printMessage() {
//        println(message)
//    }
//
//    printMessage()
//}

fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    fun validateNumber(value: Int) {
        if (value == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    validateNumber(valueA)
    validateNumber(valueB)
    validateNumber(valueC)

    return valueA + valueB + valueC
}