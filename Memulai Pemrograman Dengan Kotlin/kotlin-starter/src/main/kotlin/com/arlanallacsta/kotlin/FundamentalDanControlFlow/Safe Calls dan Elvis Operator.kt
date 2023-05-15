package com.arlanallacsta.kotlin


fun main() {

    // Safe calls operator (?.)
    /*
    val text: String? = null
    text?.length

    Dengan safe call, kompiler akan melewatkan proses jika objek tersebut bernilai null.
     */

    //Elvis Operator (?:)

    //Elvis operator memungkinkan kita untuk menetapkan default value atau nilai dasar jika objek bernilai null.

    /*
    val text: String? = null
    val textLength = text?.length ?: 7

     */
}