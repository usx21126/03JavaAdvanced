package com.xh.d3_collection_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionAPIDemo {
    public static void main(String[] args) {


        Collection<String> list = new ArrayList<>();
        list.add("Java1");
        list.add("Java1");
        list.add("Java2");
        list.add("赵敏");
        list.add("小昭");
        list.add("灭绝师太");
        System.out.println(list);

        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));


    }
}
