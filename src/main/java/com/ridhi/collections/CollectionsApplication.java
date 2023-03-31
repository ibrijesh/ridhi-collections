package com.ridhi.collections;

import java.util.*;

public class CollectionsApplication {

    public static void main(String[] args) {

        // TreeMap
        NavigableMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "brijesh");
        treeMap.put(3, "shivam");
        treeMap.put(2, "rahul");


        // traverse using keySets
        Set<Integer> keySets = treeMap.keySet();

        for (Integer key : keySets)
            System.out.println(key + " " + treeMap.get(key));

    }

}
