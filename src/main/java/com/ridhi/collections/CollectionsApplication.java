package com.ridhi.collections;

import java.util.Iterator;

public class CollectionsApplication {

    public static void main(String[] args) {

        OurGenericList<Integer> list = new OurGenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println();


        // using one line code //

        for (var x : list)
            System.out.println(x);

    }

}
