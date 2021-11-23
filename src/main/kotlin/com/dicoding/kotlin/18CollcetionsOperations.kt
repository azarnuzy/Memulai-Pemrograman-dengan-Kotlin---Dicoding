package com.dicoding.kotlin

fun main() {
    val numberList = listOf(1,2,3,4,5,6,7,8,9,10)
    val evenList = numberList.filter {it % 2 == 0}
    val notEvenList = numberList.filterNot { it % 2 == 0 }
    val multipliedBy5 = numberList.map {it * 5}
    println(evenList)
    println(notEvenList)
    println(multipliedBy5)
    println(numberList.count())
    println(numberList.count{it % 3 == 0})

    val firstOddNumber = numberList.find {it % 2 == 1}
    val firstOrNullNumber = numberList.firstOrNull {it % 2 == 3}

    println(firstOddNumber)
    println(firstOrNullNumber)

    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')

    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)

    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)
}