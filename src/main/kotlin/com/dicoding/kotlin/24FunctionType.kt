package com.dicoding.kotlin

typealias Arithmetic = (Int, Int) -> Int
typealias  ArithmeticNull = ((Int, Int) -> Int)?

fun main() {

    val sum: Arithmetic = {valueA, valueB -> valueA + valueB}
    val multiply: Arithmetic = {valueA, valueB -> valueA * valueB}

    val sumResult = sum.invoke(20, 50)
    val mutiplyResult = multiply.invoke(10, 5)

    println(sumResult)
    println(mutiplyResult)

    val sumNull: ArithmeticNull = {valueA, valueB -> valueA + valueB}
    val sumNullRes = sumNull?.invoke(20, 80)
    println(sumNullRes)
}