package com.xh.d1_stringBuilder;

import java.util.Arrays;

public class StringBuilderDemo1 {
    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder();
        System.out.println(s1);
        StringBuilder s2 = new StringBuilder("Hello");
        System.out.println(s2);

        s1.append("World");
        s1.append(123);
        s1.append('c');
        System.out.println(Integer.valueOf('i'));
        s1.append(Integer.valueOf('1'));
        System.out.println(s1);

        int[] arr1 = {11,22,33,44};
        int[] arr2 = {};
        int[] arr3 = null;
        System.out.println(getArrayData(arr1));
        System.out.println(getArrayData(arr2));
        System.out.println(getArrayData(arr3));
        System.out.println(arr1.toString());
    }
    public static String getArrayData(int[] arr){
        if(arr == null){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append((i==arr.length-1)?arr[i]:arr[i]+", ");
        }
        return sb.append("]").toString();
    }
}
