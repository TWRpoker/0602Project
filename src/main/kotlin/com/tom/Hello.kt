package com.tom

fun main(args: Array<String>) {
//    println("hello kotlin3")

    // 一個物件可以使用 val or var
    // val mean 不能再改變他的值
    // var 不能再改變他的值
    var h = Human()
    h.hello()
}


class Human{
    // kotlin 和 java class 同一個package名稱不能一樣
    // kotlin function name 習慣上是小寫
    fun hello(){
        println("hello kotlin")
    }

}