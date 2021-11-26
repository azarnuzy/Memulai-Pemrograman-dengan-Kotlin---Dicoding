package com.dicoding.kotlin

fun main() {
    val dicodingCat = Animal4("Dicoding Miaw", 5.0, 2, true)
    println(dicodingCat.getAnimalInfo)
}

class Animal4(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

val Animal4.getAnimalInfo : String
    get() = "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age}, Mamalia: ${this.isMammal}"

