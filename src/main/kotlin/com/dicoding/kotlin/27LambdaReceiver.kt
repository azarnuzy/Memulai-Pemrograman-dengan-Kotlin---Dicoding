package com.dicoding.kotlin

fun buildString(action: StringBuilder.() -> Unit):String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

fun main() {
    val message = buildString {
        append("Hello ")
        append("from ")
        append("lamda")
    }

    println(message)
}