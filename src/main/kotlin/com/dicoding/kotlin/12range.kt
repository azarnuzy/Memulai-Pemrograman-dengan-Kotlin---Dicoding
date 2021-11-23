package com.dicoding.kotlin

fun main() {
    val rangeInt = 1..10 step 3

    rangeInt.forEach {
        print("$it ")
    }
    println(rangeInt.step)

    val rangeIntTo = 1.rangeTo(10)
    val downInt = 10.downTo(1)

    rangeIntTo.forEach {
        print("$it ")
    }
    println(rangeIntTo.step)

    downInt.forEach {
        print("$it ")
    }
    println(downInt.step)

    val ranges = 1.rangeTo(20) step 3
    for((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }

    ranges.forEachIndexed{ index, _ ->
        println("index $index")
    }
}