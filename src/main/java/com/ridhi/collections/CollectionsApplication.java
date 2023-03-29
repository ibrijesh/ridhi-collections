package com.ridhi.collections;

import java.util.*;

public class CollectionsApplication {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);

        Integer[] arr = list.toArray(new Integer[0]);

        System.out.println(list);

        for (int x : arr)
            System.out.println(x);

    }

}
