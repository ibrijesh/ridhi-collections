package com.ridhi.collections;

import java.util.*;

public class CollectionsApplication {

    public static void main(String[] args) {

        // TreeMap
        NavigableMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "brijesh");
        treeMap.put(3, "shivam");
        treeMap.put(2, "rahul");


        // traverse using entrySet

        Set<Map.Entry<Integer, String>> entrySet = treeMap.entrySet();

        for (Map.Entry<Integer, String> entry : entrySet)
            System.out.println(entry.getKey() + " " + entry.getValue());

    }

}
