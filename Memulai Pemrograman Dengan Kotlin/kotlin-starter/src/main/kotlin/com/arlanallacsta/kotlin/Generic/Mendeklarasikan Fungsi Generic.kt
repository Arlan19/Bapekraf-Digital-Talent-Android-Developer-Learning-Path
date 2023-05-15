package com.arlanallacsta.kotlin.Generic

fun <T> printItem(item: T) {
    println(item)
}

fun <T> List<T>.customFilter(predicate: (T) -> Boolean): List<T> {
    val result = mutableListOf<T>()
    for (item in this) {
        if (predicate(item)) {
            result.add(item)
        }
    }
    return result
}

fun main() {
    printItem(10)
    printItem("Hello")
    printItem(true)

    val numbers = listOf(1, 2, 3, 4, 5)
    val filteredNumbers = numbers.customFilter { it % 2 == 0 }
    println(filteredNumbers)

    val names = listOf("John", "Jane", "Alice")
    val filteredNames = names.customFilter { it.startsWith("J") }
    println(filteredNames)

}