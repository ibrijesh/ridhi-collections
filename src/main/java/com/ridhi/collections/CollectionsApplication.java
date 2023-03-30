package com.ridhi.collections;

import java.util.*;

public class CollectionsApplication {

    public static void main(String[] args) {

        // Set
        Set<Integer> set = new LinkedHashSet<>();
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(7);


        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(3);
        set2.add(5);
        set2.add(2);

        System.out.println(set);
        System.out.println(set2);


    }

}
