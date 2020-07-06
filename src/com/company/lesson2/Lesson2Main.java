package com.company.lesson2;

import java.util.ArrayList;

public class Lesson2Main {

    public static void main(String[] args) {
        //Примитивы byte, short, int, long; float, double; char; boolean
        //Ссылочные - Classes, Object, String

//        byte a = 1;
//        short b = a;
//
//        short c = 1;
//        byte d = (byte)c;

        //////

//        Example example = new Example();
//        Example example1 = example;
//        Object o = new Example();
//        Example e = (Example) o;
//        e.example();
//
//        Example e1 = (Example) new Object();

//        Example example = new Example();
//        Example example1 = new Example();
//        Example example2 = example;
//
//        System.out.println(example == example1);
//        System.out.println(example == example2);

        //Wrappers
        //int - Integer
//        Integer integer = new Integer(10);
//        Integer integer1 = new Integer(10);
//        System.out.println(integer == integer1);
//
//        Integer integer2 = 10;
//        Integer integer3 = 10;
//        System.out.println(integer2 == integer3);
//
//        int a = Integer.parseInt("12345");
//        System.out.println(a);
//
//        String s = "12345";
//        String s1 = "12345";
//        String s2 = new String("12345");
//        System.out.println(s == s1);
//
//        System.out.println(s1 == s2);

//        boolean a = true;
//        int b = a ? 1 : 0;
//        System.out.println(b);

//        SimpleEnum simpleEnum = SimpleEnum.MAXIMUM;
//        System.out.println(simpleEnum.getValue());
//        switch (simpleEnum) {
//            case MEDIUM: {
//                System.out.println("This cup is " + simpleEnum.getValue());
//                break;
//            }
//        }

//        String a = "123 " + new Example();
//        System.out.println(a);
//        int a = 10;
//        test(a);
//        System.out.println(a);
//
//        Example a1 = new Example();
//        a1.value = 10;
//        test(a1);
//        System.out.println(a1.value);

        byte a = 127;
        System.out.println(++a);


    }

    public static void test(int a) {
        a = 20;
    }

    public static void test(Example a) {
        a = new Example();
        a.value = 20;
    }

}
