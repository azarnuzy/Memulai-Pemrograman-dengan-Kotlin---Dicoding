package com.dicoding.kotlin

fun main() {
    val text: String? = null
    val textLength = text?.length ?: 7
    val textLength1 = if( text != null) text.length else 7
    println("$textLength $textLength1")
}