package com.dicoding.kotlin

fun main() {
    val numberList = listOf(1,2,3,4,5)
    val anyList = listOf('a', "Kotlin", 3, true, User("Azar", 20))

    println(anyList[4])

    val anyList1 = mutableListOf('A', "Kotlin", 3, true)

    anyList1.add('d')
    anyList1.add(2, "Love")
    anyList1[3] = false
    anyList1.removeAt(1)

}