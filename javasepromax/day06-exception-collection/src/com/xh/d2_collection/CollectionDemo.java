package com.xh.d2_collection;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionDemo {
    public static void main(String[] args) {

        //1.Collection - List - ArrayList
        ArrayList<String> list = new ArrayList();
        list.add("B");
        list.add("A");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        System.out.println(list);
        System.out.println(list.get(3));

        //2.Collection - Set - HashSet
        HashSet<String> hashSet = new HashSet();
        hashSet.add("B");
        hashSet.add("A");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        System.out.println(hashSet);
    }
}
