package com.arlanallacsta.kotlin

fun main() {

    //SetOf

//    val integerSet = setOf(1, 2, 4, 2, 1, 5)
//
//    println(integerSet)

    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
//    println(setA == setB)
//
//    print(5 in setA)

//    val setC = setOf(1, 5, 7)
//    val union = setA.union(setC)
//    val intersect = setA.intersect(setC)
//
//    println(union)
//    println(intersect)

    //mutableSetOf

    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    //mutableSet[2] = 6 // tidak bisa mengubah set immutable
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1
}