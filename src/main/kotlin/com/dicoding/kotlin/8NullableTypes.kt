package com.dicoding.kotlin

fun main() {
    var text: String? = null
    text = "Dicoding"
    if(text != null) {
        val textLength = text.length
        print(textLength)
    }
}