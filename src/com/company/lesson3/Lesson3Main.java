package com.company.lesson3;

import java.util.Date;

import static java.lang.Math.PI;

public class Lesson3Main {

    public static void main(String[] args) {
        Object sorry = new MyClass(2, 2.2);
        System.out.println(sorry);

        // Reference example

        Object o = new MyClass().getClass();
        MyClass m = (MyClass) o;

        System.out.println(sorry.equals(new MyClass(2,2.2)));
        System.out.println(sorry.equals(sorry));
        System.out.println(sorry.equals(null));
        System.out.println(sorry.equals(new Object()));

        System.out.println(new MyClass(1, 2.2));

        //STATIC

        new StaticClass();
        new StaticClass();
        new StaticClass();
        new StaticClass();
        System.out.println(StaticClass.instancesAmount);
        String a = "";
        StringBuilder b = new StringBuilder("");
        long time1 = new Date().getTime();
        for (int i = 0; i < 20000; i++) {
            a += "1";
        }
        System.out.println(new Date().getTime() - time1);
        long time2 = new Date().getTime();
        for (int i = 0; i < 20000; i++) {
            b.append("1");
        }
        System.out.println(new Date().getTime() - time2);

        System.out.println(new int[3][4].length);
    }
}
