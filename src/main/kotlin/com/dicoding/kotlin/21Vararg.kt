package com.dicoding.kotlin

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

fun sets(vararg number: Int, name: String): String {
    val sum = number.sum()
    val nameRes = name
    return "$nameRes = $sum"
}

fun asList(vararg input: Array<Int>){
    for(item in input) {
        println(item)
    }
}

fun main() {
    val number = sumNumbers(10,20,1,20,4,5)
    println(number)
    val set = sets(10,10,20,30, name = "Jumlah")
    println(set)

    val numArray = intArrayOf(10,20,30,40)
    val set1 = sets(10,10, *numArray, name = "Jumlah")

    println(set1)
}