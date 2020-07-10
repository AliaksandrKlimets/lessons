package com.company.lesson5;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public void doExample() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "11");
        map.put("2", "12");
        map.put("3", "13");
        map.put("4", "14");
        System.out.println(map);
        System.out.println(map.get("1"));
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(map.get(s.getKey()));
        }

    }
}
