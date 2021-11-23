package com.dicoding.kotlin

fun main() {
    val text = "Kotlin"
    for(char in text) {
        print("$char ")
    }

    val statement = "Kotlin is \"Awesome\""
    println(statement)

    val unicode = "Unicode test: \u0291"
    println(unicode)
}