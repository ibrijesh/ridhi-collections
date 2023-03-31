package com.ridhi.collections;

import java.util.*;

public class CollectionsApplication {

    public static void main(String[] args) {

        Integer arr[] = new Integer[]{1, 3, 4, 2, 6, 8, 7};
        Arrays.sort(arr);

        for(Integer x:arr)
            System.out.println(x);
    }

}
