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


        // For Traversing graph, we need to convert Map to Set as Map cannot be traversed//

        Set<Map.Entry<Integer, List<Integer>>> entrySet = graph.entrySet();

        for (Map.Entry<Integer, List<Integer>> entry : entrySet) {

            System.out.print(entry.getKey() + "-->");

            for (Integer edge : entry.getValue())
                System.out.print(edge + " ");
            System.out.println();
        }


    }

}
