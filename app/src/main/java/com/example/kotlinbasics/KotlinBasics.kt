package com.example.kotlinbasics.kt


fun main() {
    val numbers: IntArray = intArrayOf(1, 10, 100, 1000)
    println(numbers.contentToString())

    val vegies = arrayOf(
        Vegetables("Potato", 12.0),
        Vegetables("Tomato", 11.2),
        Vegetables("Carrot", 15.6)
    )
    println(vegies.contentToString())

    val months = mutableListOf<String>("Jan", "Feb", "Mar")
    months.add("Apr")
    println(months)

    val langs = setOf("Java", "Kotlin", "Python", "Java")
    println(langs.size) //3

    //mapOf means hashmap/dictionary in other langs
    val monthsOfSeasons = mapOf("Winter" to "Dec", "Summer" to "July", "Fall" to "Nov")
    println(monthsOfSeasons["Fall"])
    for (month in monthsOfSeasons.keys) {
        println("$month -> ${monthsOfSeasons[month]}")
    }

    val arrList:ArrayList<String> = ArrayList<String>(5)
    arrList.add("octopus")
    var list:MutableList<Int> = mutableListOf<Int>()

    val itr = arrList.iterator()
    while (itr.hasNext()) {
        println(itr.next())
    }
    println("size of array lists: ${arrList.size}")

    //Lambda Expressions
    val myLambda: (Int) -> Int = { a: Int -> a + 10 }
    val sum:(Int,Int) -> Int = {a:Int,b:Int -> a+b}
    println(sum(10,5))
    val shortest ={a:Int,b:Int -> println(a+b) }



}

data class Vegetables(val name: String, val amount: Double)

            //LITTLE NOTES ABOUT KOTLIN BASICS
//Public is a default modifier in Kotlin
//A private package can be accessible within that specific file
//Internal modifier isn't available in Java
//