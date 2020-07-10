package com.company.lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson5Main {

    public static void main(String[] args) {
//        new ListExample().doExample();
//        new SetExample().doExample();
//        new MapExample().doExample();


        // Streams
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 20));
        }
        list.forEach(item -> System.out.print(item + " "));
//        list.forEach(System.out::print);
        list = list.stream().sorted().collect(Collectors.toList());
        System.out.println();
        list.forEach(item -> System.out.print(item + " "));
        list = list.stream().filter(item -> item % 2 == 1).collect(Collectors.toList());
        System.out.println();
        list.forEach(item -> System.out.print(item + " "));
        System.out.println(list.stream().anyMatch(item -> item.equals(19)));
        System.out.println(list.stream().noneMatch(item -> item.equals(19)));
        System.out.println(list.stream().allMatch(item -> item % 2 == 1));

//        System.out.println(list.stream().map(item -> "our age is " + item).collect(Collectors.toList()));
    }


}
