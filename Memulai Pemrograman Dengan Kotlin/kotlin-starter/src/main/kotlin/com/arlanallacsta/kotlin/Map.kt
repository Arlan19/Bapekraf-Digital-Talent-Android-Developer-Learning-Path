package com.arlanallacsta.kotlin

fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

//    println(capital["London"])
//    atau
//    println(capital.getValue("New Delhi"))

//    println(capital["Amsterdam"])

// Output: null


//    println(capital.getValue("Amsterdam"))

// Output: Exception in thread "main" java.util.NoSuchElementException: Key Amsterdam is missing in the map.

    val mapValue = capital.values

//    println(mapValue)

//    Untuk menambahkan key-value ke dalam map, kita perlu memastikan bahwa map yang digunakan adalah mutable
    val mutableCapital = capital.toMutableMap()

    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")

    println(mutableCapital.values)

/*
Namun perlu diperhatikan bahwa menggunakan mutable collection itu tidak disarankan. Apabila terdapat
sebuah mutable collection yang diubah oleh lebih dari 1 proses, hasil nya akan sulit untuk diprediksi.
Untuk itu, sebaiknya gunakan immutable sebisa mungkin, jika memang dibutuhkan untuk diubah, baru gunakan
mutable.
 */
}