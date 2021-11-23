package com.dicoding.kotlin

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class Color1(val value: Int) {
    RED(0xFF0000) {
        override  fun printValue() {
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00) {
        override  fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF) {
        override  fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()
}

fun main() {
    val color: Color = Color.RED
    println(color)
    println("Position color is ${color.ordinal}")
    val colors: Array<Color1> = Color1.values()
    colors.forEach{colord ->
        println(colord)
    }

    when(color) {
        Color.RED -> print("Color is Red")
        Color.GREEN -> print("Color is Green")
        Color.BLUE -> print("Color is Blue")
    }
}