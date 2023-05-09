package com.arlanallacsta.kotlin

//class User(val name : String, val age : Int){
//    override fun toString(): String {
//        return "User(name=$name, age=$age)"
//    }
//}
//
//data class DataUser(val name : String, val age : Int)

/*
fun main(){
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)
    val dataUser4 = dataUser.copy()
    val dataUser5 = dataUser.copy(age = 18)


//    println(user)
//    println(dataUser)

//    println(dataUser.equals(dataUser2))
//    println(dataUser.equals(dataUser3))

    println(dataUser4)
    println(dataUser5)
}

 */

/*
fun main() {
//    val dataUser = DataUser("nrohmen", 17)
//
//    val name = dataUser.component1()
//    val age = dataUser.component2()
//
//    println("My name is $name, I am $age years old")

    val dataUser = DataUser("nrohmen", 17)

    val (name, age) = dataUser

    println("My name is $name, I am $age years old")
}

 */

data class DataUser(val name : String, val age : Int){
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}

fun main() {
    val dataUser = DataUser("norman", 12)
    dataUser.intro()
}