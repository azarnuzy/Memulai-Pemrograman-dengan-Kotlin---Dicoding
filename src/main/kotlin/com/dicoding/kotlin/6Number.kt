package com.dicoding.kotlin

fun main() {
    val longNumber = 100L
    val shortNumber: Short = 10
    val intNumber = 100
    val byteNumber = 0b11010011
    val doubleNumber: Double = 1.3
    println("$longNumber $shortNumber $intNumber $byteNumber $doubleNumber")

    val byteNumber1 = 0b110
    val intNumber1: Int = byteNumber1.toInt()
    println(intNumber1)

    val readableNumber = 1_000_000
    print(readableNumber)
}