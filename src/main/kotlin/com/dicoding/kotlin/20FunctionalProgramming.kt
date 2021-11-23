package com.dicoding.kotlin

fun getFullName(first: String = "Kotlin", middle: String = " is", last: String = "Awesome"): String {
    return "$first $middle $last"
}

fun main() {
    println(getFullName())
}