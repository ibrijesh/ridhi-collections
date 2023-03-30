package com.ridhi.collections;

import java.util.*;

public class CollectionsApplication {

    public static void main(String[] args) {

        // Map as graph
        Map<Integer, List<Integer>> graph = new HashMap<>();

        /*
            1->2
            3->5
            1-3
        */

//        if (graph.get(1) == null)
//            graph.put(1, new ArrayList<>());

        // 1 line code
        graph.computeIfAbsent(1, f -> new ArrayList<>()).add(2);
        graph.computeIfAbsent(3, f -> new ArrayList<>()).add(5);
        graph.computeIfAbsent(1, f -> new ArrayList<>()).add(3);


        /* second way to traverse */
        Set<Integer> keySets = graph.keySet();

        for (Integer key : keySets) {
            System.out.print(key + "-->");

            for (Integer edge : graph.get(key))
                System.out.print(edge + " ");
            System.out.println();
        }



    }

}
