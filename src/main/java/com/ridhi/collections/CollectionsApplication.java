package com.ridhi.collections;

import java.util.*;

public class CollectionsApplication {

    public static void main(String[] args) {

        List<StudentMarks> stMArks = new ArrayList<>();
        stMArks.add(new StudentMarks(100, 50));
        stMArks.add(new StudentMarks(40, 70));
        stMArks.add(new StudentMarks(66, 88));
        stMArks.add(new StudentMarks(160, 99));
        stMArks.add(new StudentMarks(23, 34));


        // Priority Queue   - sort according to min math marks
        PriorityQueue<StudentMarks> pq = new PriorityQueue<>(stMArks);


        while (!pq.isEmpty())
            System.out.println(pq.poll());

    }

}
