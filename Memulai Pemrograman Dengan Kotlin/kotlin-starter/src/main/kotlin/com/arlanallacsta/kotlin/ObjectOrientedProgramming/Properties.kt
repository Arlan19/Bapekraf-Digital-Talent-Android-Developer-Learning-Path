package com.arlanallacsta.kotlin.ObjectOrientedProgramming


//class Animall{
//    var name: String = "Dicoding Miaw"
//}
//
//fun main(){
//    val dicodingCat = Animall()
//    println("Nama: ${dicodingCat.name}" )
//    dicodingCat.name = "Goose"
//    println("Nama: ${dicodingCat.name}")
//}

class Animal2{
    var name: String = "Dicoding Miaw"
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}

fun main(){
    val dicodingCat = Animal2()
    println("Nama: ${dicodingCat.name}" )
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}")
}