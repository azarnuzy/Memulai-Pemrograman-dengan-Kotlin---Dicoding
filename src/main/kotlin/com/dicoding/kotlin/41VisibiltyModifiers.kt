package com.dicoding.kotlin

class Animal7(private var name: String, private val weight: Double, private val age: Int, private val isMammal: Boolean = true) {

    fun getName() : String {
        return name
    }

    fun setName(newName: String) {
        name = newName
    }

}

open class Animal8(val name: String, protected val weight: Double)

class Cat(pName: String, pWeight: Double) : Animal8(pName, pWeight)

internal class Animal9(val name: String)

fun main() {
    val dicodingCat = Animal7("Dicoding Miaw", 2.5, 2)
    println(dicodingCat.getName())
    dicodingCat.setName("Gooose")
    println(dicodingCat.getName())
}