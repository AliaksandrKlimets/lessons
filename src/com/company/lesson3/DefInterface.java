package com.company.lesson3;

public interface DefInterface {

    default void a() {
        System.out.println("Default method");
    }
}
