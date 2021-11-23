package com.dicoding.kotlin

fun setUser(name: String, age: Int): String {
    return "Your name is $name, and you $age years old"
}

fun main() {
    val user = setUser("Azar", 20)
    println(user)
}