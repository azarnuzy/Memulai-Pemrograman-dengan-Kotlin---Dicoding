package com.dicoding.kotlin

fun main() {
    val numbers = listOf(5,1,2,3)
    val fold = numbers.fold(10) {current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    println("Fold result: $fold")

    val foldRight = numbers.foldRight(10) {current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    println("Fold result: $foldRight")

    val drop = numbers.drop(1)
    println(drop)

    val dropLast = numbers.dropLast(1)
    println(dropLast)

    val take = numbers.take(3)
    println(take)
}