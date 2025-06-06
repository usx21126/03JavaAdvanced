package com.xh.d6_set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("D");
        set.add("E");
        set.add("F");
        System.out.println(set);


        System.out.println("abc".hashCode());
        System.out.println("Ab".hashCode());
        System.out.println("C".hashCode());
        System.out.println("D".hashCode());

    }
}
