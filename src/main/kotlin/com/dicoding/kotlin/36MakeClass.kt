package com.dicoding.kotlin

class Animal(val name: String, val weight: Double, val age: Int, val isMammal: Boolean) {
    fun eat() {
        println("$name makan !")
    }

    fun sleep() {
        println("$name tidur !")
    }
}

class AnimalProperties {
    var name: String = "Dicoding Miaw"
    get() {
        println("Fungsi getter terpanggil")
        return field
    }

    set(value) {
        println("Fungsi setter terpanggil")
        field = value
    }
}

fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
    dicodingCat.eat()
    dicodingCat.sleep()

    val catDicoding = AnimalProperties()
    catDicoding.name = "Goose"
    println("Nama: ${catDicoding.name}")

}