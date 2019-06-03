package com.tom

fun main(args: Array<String>) {
//    println("hello kotlin3")

    // 一個物件可以使用 val or var
    // val mean 不能再改變他的值
    // var 不能再改變他的值
    var h = Human(height = 1.45f, weight = 80.0f)
    h.hello()
    println(h.bmi())
    //var h2 = Human(height = 1.43f, weight = 45.0f, name = "Tome")
    var h2 = Human(1.43f,56.4f)
    h2.hello()
    println(h2.bmi())


    val age = 12

    var name : String

    println(age > 50)

    val c : Char= 'a'
    println( c.toInt() > 60)
//    name = "123"
}

//主要建構子
class Human(var weight : Float, var height :Float, var name : String = ""){

    //在建構子完成的時候自動執行
    init {
        println("test$height" )
    }

    //次要建構子，次要建構子不可以使用  var or val
    //constructor(name: String, weight: Float, height: Float):this(weight, height)

    // kotlin 和 java class 同一個package名稱不能一樣
    // kotlin function name 習慣上是小寫
    fun hello(){
        println("hello kotlin" + weight)
    }

    fun bmi() : Float{
        var bmi = weight / (height*height)
        return  bmi
    }

}