package com.ridhi.collections;

public class CollectionsApplication {

    public static void main(String[] args) {

        OurGenericList<Integer> list = new OurGenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // it's not good way to use .get method , because maybe in future instead of list some other data structure is used and .get method is not applicable, OOP's polymorphism will not be achieved.

        System.out.println(list.getItemAtIndex(3));


        // We have not implemented iterable //
        for (int x : list)
            System.out.println(x);

    }

}
