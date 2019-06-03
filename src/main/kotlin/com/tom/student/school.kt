package com.tom.student

fun main(args: Array<String>) {
//    var stu = Student("Jack" ,50, 100)
//    stu.print()
    Student("jack", 50 , 100).print()
}

class Student(var name : String, var english : Int, var math : Int){
    fun print(){
        println(name + "\t" + english + "\t" + math + "\t"
                + (english + math) / 2)
    }
}