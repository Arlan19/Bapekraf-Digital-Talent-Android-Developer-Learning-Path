package com.arlanallacsta.kotlin

fun main() {

    /*
    Untuk mengetahui nilai maksimal yang dapat disimpan oleh suatu tipe Number, kita bisa menggunakan properti
    MAX_VALUE.  Sementara untuk mengetahui nilai minimal yang dapat disimpan, gunakan properti MIN_VALUE.
     */

    /*
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    println(maxInt)
    println(minInt)

     */

    /*
    Di Kotlin kita tidak bisa melakukan konversi secara langsung. Contoh, ketika ingin melakukan konversi
    dari tipe data Byte ke tipe data Int.

    fun main() {
        val byteNumber: Byte = 1
        val intNumber: Int = byteNumber // compile error
    }

    Kode akan gagal dikompilasi dengan log eror berikut:

    Error:(4, 18) Kotlin: Type mismatch: inferred type is Byte but Int was expected

    Untuk mengatasinya, lakukan konversi dengan bantuan beberapa fungsi seperti toInt() berikut:

    val byteNumber: Byte = 10
    val intNumber: Int = byteNumber.toInt() // ready to go

    Kode di atas menggunakan fungsi toInt() untuk melakukan konversi secara eksplisit dari tipe data Byte
    ke tipe data Int. Adapun beberapa fungsi konversi yang dapat kita gunakan antara lain:

        -toByte(): Byte
        -toShort(): Short
        -toInt(): Int
        -toLong(): Long
        -toFloat(): Float
        -toDouble(): Double
        -toChar(): Char
     */

    val stringNumber = "23"
    val intNumber = 3

    print(intNumber + stringNumber.toInt())

}