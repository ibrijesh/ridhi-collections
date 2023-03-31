package com.ridhi.collections;

import java.util.*;

public class CollectionsApplication {

    public static void main(String[] args) {

        Integer arr[] = new Integer[]{1, 3, 4, 2, 6, 8, 7};

        // convert Array to List //
        List<Integer> list = Arrays.asList(arr);

        // sort in natural ordering
        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);

    }

}
