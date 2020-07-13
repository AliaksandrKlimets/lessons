package com.company.lesson6;

import com.company.lesson2.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public void go() {

//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 15; i++) {
//            list.add((int)(Math.random() * 20));
//        }
//
//        list.stream().forEach(i -> System.out.print(i));
//        list.stream().forEach(System.out::print);

        List<ExampleA> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(new ExampleA((int)(Math.random() * 20)));
        }
        list.stream().forEach(i -> System.out.print(i.getValue() + " "));
        System.out.println();

        list.stream()
                .filter(i -> i.getValue() % 2 == 0) // filtered
                .sorted((a, b) -> Integer.compare(a.getValue(), b.getValue())) // sorted
                .distinct() // unique
                .map(i -> "Value is: " + i.getValue()) // mapped
                .forEach(System.out::println); // display

        list = list.stream().filter(i -> i.getValue() % 2 == 0).collect(Collectors.toList());

        //min max
        System.out.println(list.stream().min((a, b) -> Integer.compare(a.getValue(), b.getValue())).get().getValue());
        System.out.println(list.stream().max((a, b) -> Integer.compare(a.getValue(), b.getValue())).get().getValue());

        //match
        System.out.println(list.stream().anyMatch(i -> i.getValue() == 7));
        List<ExampleB> list2 = new ArrayList<>();
        list2.add(new ExampleB(new ArrayList<>(Arrays.asList("Chess", "Football"))));
        list2.add(new ExampleB(new ArrayList<>(Arrays.asList("Volleyball", "Football"))));
        list2.add(new ExampleB(new ArrayList<>(Arrays.asList("Chess", "chess"))));

        // any match
//        list2.stream()
//                .filter(i -> i.getList().stream().anyMatch(item -> item.equalsIgnoreCase("123")))
//                .map(i -> i.getList().toString())
//                .forEach(i -> System.out.println(i));


        // none match
//        list2.stream()
//                .filter(i -> i.getList().stream().noneMatch(item -> item.equalsIgnoreCase("chess")))
//                .map(i -> i.getList().toString())
//                .forEach(i -> System.out.println(i));

        // none match
        list2.stream()
                .filter(i -> i.getList().stream().allMatch(item -> item.contains("ball")))
                .map(i -> i.getList().toString())
                .forEach(i -> System.out.println(i));

    }
}
