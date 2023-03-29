package com.ridhi.collections;

import java.util.*;

public class CollectionsApplication {

    public static void main(String[] args) {

        // FIFO queue
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());

    }

}
