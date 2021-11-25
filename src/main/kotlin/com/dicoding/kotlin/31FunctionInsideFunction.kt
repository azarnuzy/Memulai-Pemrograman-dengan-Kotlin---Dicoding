package com.dicoding.kotlin

import java.lang.IllegalArgumentException

fun setWord(message: String) {
    fun printMessage(text: String) {
        println(text)
    }

    printMessage(message)
}

fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    fun Int.validateNumber() {
        if(this == 0) {
            throw IllegalArgumentException("Value must be better than 0")
        }
    }

    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()

    return valueA + valueB +valueC
}

fun main() {

}