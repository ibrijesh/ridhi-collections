package com.ridhi.collections;

import java.util.*;

public class CollectionsApplication {

    public static void main(String[] args) {

        // Map
        Map<String, Integer> map = new HashMap<>();
        map.put("shivam", 1);
        map.put("brijesh", 2);
        map.put("rahul", 3);


        System.out.println(map);
        System.out.println(map.containsKey("rahul"));
        System.out.println(map.containsKey("ashish"));

    }

}
