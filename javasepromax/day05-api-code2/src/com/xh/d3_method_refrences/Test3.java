package com.xh.d3_method_refrences;

import java.util.Arrays;
import java.util.Comparator;

public class Test3 {
    public static void main(String[] args) {
        String[] names = {"dilei","Angela","baby","caocao","Coach","曹操","deby","eason","andy"};

//        Arrays.sort(names,(o1,o2) -> o1.compareToIgnoreCase(o2));
        Arrays.sort(names,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
