package com.example.androidkotlindeveloperday4

fun main() {
    // immutable list, cant add/remove
    val shoppingList = listOf("Processor", "RAM","GPU","SSD")

    //mutable list
    val mutableShoppingList = mutableListOf("Processor", "RAM","GPU","SSD")

    mutableShoppingList.add("cooling system")
    mutableShoppingList.add(3,"cabinet")
    mutableShoppingList.removeAt(0)
    mutableShoppingList.add(0,"CPU")
    mutableShoppingList.set(1,"RAM DDR5")
    if (mutableShoppingList.contains("RAM DDR5")){
        mutableShoppingList[1]="RAM DDR6"
    }
    mutableShoppingList.forEachIndexed{ i, x ->
        println("element #$i: $x")
    }
    println("last element: ${mutableShoppingList.last()}")

    for (x in 1..3){
        println("another way to print $x")
    }

    for (x in mutableShoppingList) {
        println("this is also a $x")
    }
}