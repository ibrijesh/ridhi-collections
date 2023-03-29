package com.ridhi.collections;

import java.util.*;

public class CollectionsApplication {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);


        // [1,2,3]
        ListIterator<Integer> iterator = linkedList.listIterator();

        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.previous());

    }

}
