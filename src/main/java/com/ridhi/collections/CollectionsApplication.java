package com.ridhi.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionsApplication {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());

        /*   OR      */

        for (var x : list)
            System.out.println(x);

    }

}
