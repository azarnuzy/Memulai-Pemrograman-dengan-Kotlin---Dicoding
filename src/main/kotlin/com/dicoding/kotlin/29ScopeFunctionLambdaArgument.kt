package com.dicoding.kotlin

fun main() {
    val message: String? = null
    /*message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }*/
    //dengan menggunakan fungsi let seperti kode diata maka dapat digunakan penerapan operator safe call
    val length = message?.length ?: 0 * 2
    val text = "text length $length"
    println(text)

    message?.let {
        val length1 = it.length * 2
        val text = "text length $length1"
        println(text)
    } ?: run {
        val text = "message is null"
        println(text)
    }

    val text1 = "Hello Kotlin"
    val result = text1.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")
}