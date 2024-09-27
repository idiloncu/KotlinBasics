package com.example.kotlinbasics

class OuterClass {
    //Inner classların en buyuk avantaji içinde oldukları classın
    //private objelerine bile erisebilmeleridir.

    //Interface ve inner olmayan classlarda declare edilemezler

    private var name: String = "Mr X"

    inner class InnerClass {
        var description: String = "code inside inner class"
        private var id: Int = 101
        fun foo() {
            println("name is ${name}")
        // access the outer class member even private
        }
    }
}