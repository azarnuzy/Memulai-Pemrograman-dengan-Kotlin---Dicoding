package com.dicoding.kotlin
data class Item(val key: String, val value: Any)
fun main() {
    val total = listOf(1,2,3,4,5,6,7,8,9,10, 1,2,3,4)
    val index = listOf(2,3,5,8)
    val slice = total.slice(3..7)
    val sliceIndex = total.slice(index)
    println(slice)
    println(sliceIndex)

    val distinct = total.distinct()
    println(distinct)

    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )

    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }

    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinct1 = text.distinctBy {
        it.length
    }

    println(distinct1)

    val word = "Qwerty"
    val chunked = word.chunked(3)
    println(chunked)

    val chunkedTransform = word.chunked(3) {
        it.toString().toLowerCase()
    }

    println(chunkedTransform)
}