package com.xh.d6_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class StudentDemo3 {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();
        set.add("java1");
        set.add("java2");
        set.add("html");
        set.add("html");
        set.add("php");
        set.add("css");
        System.out.println(set);
    }
}
