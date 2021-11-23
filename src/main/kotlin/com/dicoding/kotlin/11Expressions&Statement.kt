package com.dicoding.kotlin


import kotlin.random.Random

fun getRegisterNumber() = Random.nextInt(100)

fun main() {
    val openOffice = 7
    val now = 8
    val office = if(now > openOffice) "Office already open" else "Office close"
    println(office)

    val value = 7
    val stringOfValue = when (value) {
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value cannot be reached"
    }

    println(stringOfValue)


    val anyType : Any = 100L
    when(anyType) {
        is Long -> println("the value has a Long type")
        is String -> println("the value has a string type")
        else -> println("undefined")
    }

    val registerNumber = when(val regis:Int = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }

    println(registerNumber)
}
