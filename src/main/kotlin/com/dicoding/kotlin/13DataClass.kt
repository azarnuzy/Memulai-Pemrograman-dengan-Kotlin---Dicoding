package com.dicoding.kotlin

class User(val name: String, val age: Int) {
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

data class DataUser(val name: String, val age: Int) {
    fun intro() {
        println("My name is $name, I am $age years old")
    }
}

fun main() {
    val user = User("Azar", 20)
    val dataUser = DataUser("Azar", 20)

    println(user)
    println(dataUser)

    val dataUser2 = DataUser("Azar", 20)
    val dataUser3 = DataUser ("Nuzy", 19)
    val dataUser4 = dataUser3.copy(age = 20)

    println(dataUser.equals(dataUser2))
    println(dataUser2.equals(dataUser3))
    println(dataUser4)
}