package com.ridhi.collections;

import java.util.*;

public class CollectionsApplication {

    public static void main(String[] args) {

        // Set
        NavigableSet<Integer> treeSet = new TreeSet<>((a, b) -> b - a);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(4);
        treeSet.add(9);
        treeSet.add(5);

        System.out.println(treeSet);


    }

}
