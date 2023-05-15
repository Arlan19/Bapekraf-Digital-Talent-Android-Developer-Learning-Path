package com.arlanallacsta.kotlin.Generic

//fun main() {
//    val longArrayList = ArrayList<Long>()
//    val firstLong = longArrayList.get(0)
//}
//
//class ArrayList<T> : List<T> {
//    override fun get(index: Int): T {
//        return this[index]
//    }
//}
//
//interface List<T> {
//    operator fun get(index: Int): T
//}

class Box<T>(private val item: T) {
    fun getItem(): T {
        return item
    }
}

fun <T> printItems(items: List<T>) {
    for (item in items) {
        println(item)
    }
}

fun main() {
    val intBox = Box(10)
    val intValue: Int = intBox.getItem()
    println(intValue)

    val stringBox = Box("Hello")
    val stringValue: String = stringBox.getItem()
    println(stringValue)

    val booleanBox = Box(true)
    val booleanValue: Boolean = booleanBox.getItem()

    val numbers = listOf(1, 2, 3, 4, 5)
    printItems(numbers)

    val names = listOf("John", "Jane", "Alice")
    printItems(names)

}
