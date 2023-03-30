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

        // Set
        Set<StudentMarks> treeSet = new TreeSet<>(stMArks);


        for (StudentMarks st : treeSet)
            System.out.println(st);

    }

}
