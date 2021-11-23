package com.dicoding.kotlin

fun main() {
    val integerSet = setOf(1,2,4,2,1,5)
    val setC = setOf(1,5,7)
    val union = integerSet.union(setC)
    val intersect = integerSet.intersect(setC)
    println(integerSet)
    println(union)
    println(intersect)

    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    //mutableSet[2] = 6 // tidak bisa mengubah set immutable
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1
}