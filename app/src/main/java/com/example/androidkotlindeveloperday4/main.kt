package com.example.androidkotlindeveloperday4

fun main() {
    // immutable list, cant add/remove
    val shoppingList = listOf("Processor", "RAM","GPU","SSD")

    //mutable list
    val mutableShoppingList = mutableListOf("Processor", "RAM","GPU","SSD")

    mutableShoppingList.add("cooling system")
    mutableShoppingList.add(3,"cabinet")
    mutableShoppingList.forEach{ x ->
        println(x)
    }
    println("last element: ${mutableShoppingList.last()}")
}