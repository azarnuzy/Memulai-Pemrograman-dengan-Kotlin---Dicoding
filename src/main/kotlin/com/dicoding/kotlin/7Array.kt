package com.dicoding.kotlin

fun main() {
    val array = arrayOf(1, 3, 5, 7, "Dicoding")
    println(array[4])

    val intArray = Array(4, {i -> i * i})
    println(intArray[2])
}