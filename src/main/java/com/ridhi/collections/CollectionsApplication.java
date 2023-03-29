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
        list2.add(6);

        list2.addAll(list);

        // <4,5,6,1,2,3>
        List<Integer> list3 = list2.subList(1, 4);
        list3.set(0, 100);


        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);

    }

}
