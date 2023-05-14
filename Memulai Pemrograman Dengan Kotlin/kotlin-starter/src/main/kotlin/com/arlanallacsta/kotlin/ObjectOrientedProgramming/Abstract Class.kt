package com.arlanallacsta.kotlin.ObjectOrientedProgramming

//abstract class Shape {
//    abstract fun calculateArea(): Double
//    abstract fun calculatePerimeter(): Double
//}
//
//class Rectangle(private val length: Double, private val width: Double) : Shape() {
//    override fun calculateArea(): Double {
//        return length * width
//    }
//
//    override fun calculatePerimeter(): Double {
//        return 2 * (length + width)
//    }
//}
//
//class Circle(private val radius: Double) : Shape() {
//    override fun calculateArea(): Double {
//        return Math.PI * radius * radius
//    }
//
//    override fun calculatePerimeter(): Double {
//        return 2 * Math.PI * radius
//    }
//}
//
//fun main() {
//    val rectangle = Rectangle(5.0, 3.0)
//    println("Rectangle Area: ${rectangle.calculateArea()}")
//    println("Rectangle Perimeter: ${rectangle.calculatePerimeter()}")
//
//    val circle = Circle(2.5)
//    println("Circle Area: ${circle.calculateArea()}")
//    println("Circle Circumference: ${circle.calculatePerimeter()}")
//}

//abstract class Animal(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){
//
//    fun eat(){
//        println("$name sedang makan !")
//    }
//
//    fun sleep(){
//        println("$name sedang tidur !")
//    }
//}
//
//class Cat(name: String, weight: Double, age: Int,isCarnivore: Boolean) : Animal(name, weight, age, isCarnivore)
//
//fun main(){
//    val kucing = Cat("dicoding animal", 2.6, 1, true)
//    kucing.eat()
//}