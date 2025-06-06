package com.xh.d4_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {

        Collection<String> list = new ArrayList<>();
        list.add("古力娜扎");
        list.add("迪丽热妈");
        list.add("丑笔畅");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("------------------------");
        list.forEach(System.out::println);
        System.out.println("------------------------");
        int[] arr = {1, 2, 3, 4, 5};
        for(int i : arr) {
            System.out.println(i);
        }
    }
}
