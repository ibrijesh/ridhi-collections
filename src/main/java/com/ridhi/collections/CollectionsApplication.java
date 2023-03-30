package com.ridhi.collections;

import java.util.*;

public class CollectionsApplication {

    public static void main(String[] args) {

        // Priority Queue   - sort according to min math marks
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyCustomComparator());

        pq.offer(1);
        pq.offer(2);
        pq.offer(3);


        while (!pq.isEmpty())
            System.out.println(pq.poll());

    }

}
