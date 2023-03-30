package com.ridhi.collections;

import java.util.*;

public class CollectionsApplication {

    public static void main(String[] args) {

        // Set
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);


        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(3);
        set2.add(5);

        System.out.println(set);
        System.out.println(set2);

        set.addAll(set2);
        System.out.println("After addAll()");
        System.out.println(set);
        System.out.println(set2);

    }

}
