package com.dicoding.kotlin

fun main() {
    val dataUser = DataUser("nrohmen", 17)
    val name = dataUser.component1()
    val age = dataUser.component2()

    println(name)
    println(age)

    val (name1, age1) = dataUser

    println(name1)
    println(age1)

    dataUser.intro()
}