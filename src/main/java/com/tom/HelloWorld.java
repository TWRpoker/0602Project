package com.tom;

public class HelloWorld {
    public  static  void main (String[] arges){
//        System.out.println("Hello world");
        Person person = new Person(89.0f, 1.67f);
        person.Hell0();
//        person.height = 1.45f;
//        person.weight = 60;
        person.bmi();
        System.out.println(person.bmi());

        // int 32bit short 16bit long 64bit
        int age = 12;
        Integer age2 = 12;
        age2.floatValue();

        int score = 60;
        System.out.println(score > 40 || score < 60);

        char c = 'a';
        System.out.println(c > 60);


        // command + shift + / 多行註解
        /*short ageShor = 12;
        Short ageShort2 = 12;
        ageShort2.byteValue();

        long ageLong = 123;

        // char 16bit byte 8bit
        char c = '我';
        Character b = '1';
        byte b2 = 127;

        float weight = 32.5f;
        double height = 32.3;

        boolean adult = true;

        String name = "Tom";*/

        // 基本資料型態開頭都是小寫 基本資料沒有功能
        // 參照資料型態開頭都是大寫 參照資料型態有功能



    }


}
