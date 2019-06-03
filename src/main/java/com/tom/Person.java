package com.tom;

public class Person {

    float height;
    float weight;
    String name;

    public Person(float weight, float height){
        this.height = height;
        this.weight = weight;
    }

    public Person(String name, float weight, float height){
        this(weight, height);
        this.name = name;
    }

    public void Hell0(){

        //快捷鍵 sout 產生System.out.println
        System.out.println("heello world");
    }

    public float bmi(){
        float bmi = weight / (height*height);
        return  bmi;
    }
}
