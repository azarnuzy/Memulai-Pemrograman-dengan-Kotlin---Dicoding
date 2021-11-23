package com.dicoding.kotlin

val message = { println("Hello From Lambda")}
val printMessage = {message: String -> println(message)}
val messageLength = {message: String -> message.length}

fun main() {
    message()
    printMessage("Hello From Lambda2")
    val length = messageLength("Hello From Lambda")
    println("Message Length = $length")
}