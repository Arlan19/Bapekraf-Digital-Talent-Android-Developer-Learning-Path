package com.arlanallacsta.kotlin.Generic

//abstract class Vehicle(wheel: Int)
//class Car(speed: Int) : Vehicle(4)
//class MotorCycle(speed: Int) : Vehicle(2)
//
//fun main() {
//    val car = Car(200)
//    val motorCycle = MotorCycle(100)
//    var vehicle: Vehicle = car
//    vehicle = motorCycle
//
//    val carList = listOf(Car(100) , Car(120))
//    val vehicleList = carList
//}

// Covariance

//interface Animal {
//    fun sound()
//}
//
//class Cat : Animal {
//    override fun sound() {
//        println("Meow")
//    }
//}
//
//class Dog : Animal {
//    override fun sound() {
//        println("Woof")
//    }
//}
//
//interface Container<out T> {
//    fun getItem(): T
//}
//
//class AnimalContainer<out T : Animal>(private val item: T) : Container<T> {
//    override fun getItem(): T {
//        return item
//    }
//}
//
//fun main() {
//    val cat: Cat = Cat()
//    val catContainer: Container<Cat> = AnimalContainer(cat)
//    val animalContainer: Container<Animal> = catContainer
//
//    val dog: Dog = Dog()
//    val dogContainer: Container<Dog> = AnimalContainer(dog)
//    val animalContainer2: Container<Animal> = dogContainer
//
//    animalContainer.getItem().sound() // Meow
//    animalContainer2.getItem().sound() // Woof
//}

// Contravariance

//interface Animal {
//    fun sound()
//}
//
//class Cat : Animal {
//    override fun sound() {
//        println("Meow")
//    }
//}
//
//class Dog : Animal {
//    override fun sound() {
//        println("Woof")
//    }
//}
//
//interface Container<in T> {
//    fun addItem(item: T)
//}
//
//class AnimalContainer<in T : Animal> : Container<T> {
//    private val items = mutableListOf<T>()
//    override fun addItem(item: T) {
//        items.add(item)
//    }
//
//    fun printItems() {
//        for (item in items) {
//            item.sound()
//        }
//    }
//}
//
//fun main() {
//    val cat: Cat = Cat()
//    val catContainer: Container<Cat> = AnimalContainer()
//    catContainer.addItem(cat)
//    val dog: Dog = Dog()
//    val dogContainer: Container<Dog> = AnimalContainer()
//    dogContainer.addItem(dog)
//
//    catContainer.printItems() // Meow
//    dogContainer.printItems() // Woof
//}