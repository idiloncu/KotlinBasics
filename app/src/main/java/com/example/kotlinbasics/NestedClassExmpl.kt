package com.example.kotlinbasics

class NestedClassExmpl {
    private var name : String="XXX"
    class NestedClass {
        var description:String="code inside nested class"
        private var id:Int=111
        fun foo() {
            println("Id is $id")
        }
    }
    fun main(args:Array<String>) {
     println(NestedClassExmpl.NestedClass().foo())
    }
}