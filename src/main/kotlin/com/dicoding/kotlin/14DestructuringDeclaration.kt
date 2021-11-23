package com.dicoding.kotlin

fun main() {
    val dataUser = DataUser("nrohmen", 17)
    val name = dataUser.component1()
    val age = dataUser.component2()

    println(name)
    println(age)
}