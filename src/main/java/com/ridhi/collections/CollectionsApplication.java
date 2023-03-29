package com.ridhi.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsApplication {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);


        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(7);

        list2.addAll(list);


        System.out.println(list);
        System.out.println(list2);

        for (var x : list2)
            System.out.println(x);

    }

}
