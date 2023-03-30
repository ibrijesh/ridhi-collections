package com.ridhi.collections;

import java.util.*;

public class CollectionsApplication {

    public static void main(String[] args) {

        // Deque
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerFirst(1);
        deque.offerFirst(2);

        System.out.println(deque);

        deque.pollFirst();
        System.out.println(deque.peekFirst());
        System.out.println(deque);


    }

}
