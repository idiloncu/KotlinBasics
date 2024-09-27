package com.example.kotlinbasics
//exception handling notes
fun Exception() {

    fun getNumber(str: String): Int {
        return try {
            Integer.parseInt(str)

        } catch (e: ArithmeticException) {
            0
        }
    }
    val str = getNumber("10")
}

fun main(args: Array<String>) {
    val age : Int=9
    if (age < 18){
        throw ArithmeticException("under age")
    }
    //Kendi istegimizle hata gönderirken throw u kullanırız
}