package com.dicoding.kotlin

fun isEvenNumber(number: Int) = number % 2 == 0
var message3 = "Kotlin"
fun main() {
    // val sum: (Int, Int) -> Int = {valueA, valueB -> valueA + valueB}
    /*val sum: (Int, Int) -> Int = ::count
    fun count(valueA: Int, valueB: Int): Int {
        return valueA + valueB
    }*/

    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber)
    println(evenNumbers)

    //Property references
    println(::message3.name)
    println(::message3.get())

    ::message3.set("Kotlin Academy")

    println(::message3.get())
}