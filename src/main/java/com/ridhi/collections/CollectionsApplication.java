package com.ridhi.collections;

import java.util.*;

public class CollectionsApplication {

    public static void main(String[] args) {

        // Set
        NavigableSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(4);
        treeSet.add(9);
        treeSet.add(5);

        System.out.println(treeSet);
        System.out.println(treeSet.ceiling(6));

    }

}
