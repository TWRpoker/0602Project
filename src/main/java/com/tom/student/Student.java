package com.tom.student;

public class Student {
    //IntelJ hotkey 選擇變數按下 command + N 產生 construtor
    String id;
    String name;
    int english ;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }
//由intel 產生的contstrutor 可以使用tab 直接做重新命名的動作
//    public Student(String tom, int englisht, int math) {
//    }

    public void print(){
        System.out.println(name + "\t" + english + "\t" +  math + "\t" +
                (english + math)/2);
    }
}
