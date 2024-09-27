package com.example.kotlinbasics


fun main(args: Array<String>) {
    val obj: Any = "String unsafe cast"
    val str: String? = obj as? String
    println(str)

    val location: Any = "Kotlin"
    var safeStr: String? = location as? String
    val safeInt: Int? = location as? Int //output: null

}
