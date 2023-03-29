package com.ridhi.collections;

import java.util.*;

public class CollectionsApplication {

    public static void main(String[] args) {

        // FIFO queue
        Queue<Integer> queue1 = new ArrayDeque<>();
        queue1.offer(1);
        queue1.offer(2);
        queue1.offer(3);


        System.out.println(queue1.peek());
        System.out.println(queue1.poll());
        System.out.println(queue1.peek());


    }

}
