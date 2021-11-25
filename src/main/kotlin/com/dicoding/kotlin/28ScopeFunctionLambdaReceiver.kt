package com.dicoding.kotlin

import java.lang.StringBuilder

fun main() {
    val text = "Hello"
    val result = text.run {
        val from = this
        val to =this.replace("Hello", "Kotlin")
        "Replace text from $from to $to"
    }
    println("result: $result")

    val message = "Hello Kotlin!"
    val result1 = with(message) {
        println("value is $this")
        println("with length ${this.length}")
        "first character is ${this[0]}" + " and last character is ${this[this.length - 1]}"
    }

    println(result1)

    /*val builder = StringBuilder()
    builder.append("Hello ")
    builder.append("Kotlin!")
    println(builder.toString())*/
    //dengan fungsi apply kode di atas dapat ditulis sebagai berikut
    val message1 = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(message1.toString())
}