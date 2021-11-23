package com.dicoding.kotlin

fun Int.printInt() {
    println("value $this")
}

fun Int.plusThree(): Int {
    return this + 3
}

val Int.slice: Int
    get() = this / 2

fun main() {
    100.printInt()

    println(10.plusThree())
    println(50.slice)
}