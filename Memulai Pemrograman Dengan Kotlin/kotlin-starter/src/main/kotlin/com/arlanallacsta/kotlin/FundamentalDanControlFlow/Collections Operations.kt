package com.arlanallacsta.kotlin

// filter() dan filterNot()

//fun main() {
//    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    val evenList = numberList.filter { it % 2 == 0 }
//    val notEvenList = numberList.filterNot { it % 2 == 0 }
//
//    println(evenList)
//    println(notEvenList)
//}

// map()

//fun main() {
//    val numberList = listOf(1,2,3,4,5,6,7,8,9,10)
//    val multipliedBy5 = numberList.map { it * 5 }
//
//    println(multipliedBy5)
//}

// count()

//fun main() {
//    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    println(numberList.count())
//    print(numberList.count { it % 3 == 0 })
//}

// find(), firstOrNull(), & lastOrNull()

//fun main() {
//    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    val firstOddNumber = numberList.find { it % 2 == 1 }
//    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }
//
//    println(firstOddNumber)
//    println(firstOrNullNumber)
//}

// first() & last()

//fun main() {
//    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
//    val moreThan10 = numberList.first { it > 10 }
//    print(moreThan10)
//}

// sum()

//fun main() {
//
//    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    val total = numberList.sum()
//
//    println(total)
//}

// sorted()

fun main() {
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)

    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)
}