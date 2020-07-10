package com.company.lesson5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public void doExample() {
        List<String> myList = new ArrayList<>();
        myList.add("1");
        myList.add("2");
        myList.add("3");
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.get(2));
        System.out.println(myList.contains("1"));

        for (String s : myList) {
            System.out.println(s);
        }

        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
//            System.out.println(s);
            if (s.equals("1")) {
                iterator.remove();
            }
        }

        for (String s : myList) {
            System.out.println(s);
        }
    }
}
