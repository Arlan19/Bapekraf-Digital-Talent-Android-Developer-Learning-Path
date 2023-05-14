package com.arlanallacsta.kotlin.ObjectOrientedProgramming

//class Animal(private val name: String, private val weight: Double, private val age: Int, private val isMammal: Boolean){
//
//}
//
//fun main() {
//    val dicodingCat = Animal("Dicoding Miaw", 2.5, 2)
//    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
//}

//class Animal(private var name: String, private val weight: Double, private val age: Int, private val isMammal: Boolean = true) {
//
//    fun getName() : String {
//        return name
//    }
//
//    fun setName(newName: String) {
//        name = newName
//    }
//
//    fun getWeight() : Double{
//        return weight
//    }
//
//}
//
//fun main() {
//    val dicodingCat = Animal("Dicoding Miaw", 2.5, 2)
//    println(dicodingCat.getName())
//    dicodingCat.setName("Gooose")
//    println(dicodingCat.getName() + " " + dicodingCat.getWeight())
//}

//open class Animal(val name: String, protected val weight: Double)
//
//class Cat(pName: String, pWeight: Double) : Animal(pName, pWeight) {
//    fun getWeight(){
//        println("The weight of $name is $weight kg.")
//    }
//}
//
//fun main() {
//    val cat = Cat("Dicoding Miaw", 2.0)
//    println("Nama Kucing: ${cat.name}")
////    println("Berat Kucing: ${cat.getWeight()}") //Cannot access 'weight': it is protected in 'Cat'
//    cat.getWeight()
//}


