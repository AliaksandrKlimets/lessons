package com.company.lesson5;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public void doExample() {
        Set<String> mySet = new HashSet<>();
        mySet.add("1");
        mySet.add("2");
        mySet.add("3");
        mySet.add("a");
        System.out.println(mySet);
    }
}
