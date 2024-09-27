package com.example.kotlinbasics

open class Base {
    protected open val i = 777

}
class Derived: Base() {
    fun getValue() {
        return println(i.toString())

    }
}

class Derived2: Base() {
    fun getValue() :Int{
        return i
    }
    override val i = 444
}