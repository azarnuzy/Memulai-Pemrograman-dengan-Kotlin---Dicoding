package com.dicoding.kotlin

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

var sum: (Int) -> Int = {value -> value + value}

fun printResult1(value: Int, sum1: (Int) -> Int) {
    val result = sum1(value)
    println(result)
}

fun main() {
    printResult(10, sum)
    printResult1(30) {value ->
        value + value
    }
}