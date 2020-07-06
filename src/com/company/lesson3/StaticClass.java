package com.company.lesson3;

public class StaticClass {

    public static int instancesAmount = 0;

    public StaticClass() {
        instancesAmount++;
    }
}
