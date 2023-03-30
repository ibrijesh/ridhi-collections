package com.ridhi.collections;

import java.util.*;

public class CollectionsApplication {

    public static void main(String[] args) {

        // Map
        Map<String, StudentMarks> map = new HashMap<>();
        map.put(
                "rahul",
                new StudentMarks(44, 67)
        );
        map.put(
                "brijesh",
                new StudentMarks(64, 87)
        );
        map.put(
                "shivam",
                new StudentMarks(74, 64)
        );


        System.out.println(map);
        System.out.println(map.get("rahul").getMaths());

        // null pointer issue
        System.out.println(map.get("ashish").getMaths());

    }

}
