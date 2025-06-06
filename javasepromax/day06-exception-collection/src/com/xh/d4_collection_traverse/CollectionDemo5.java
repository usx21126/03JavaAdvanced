package com.xh.d4_collection_traverse;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo5 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        //1.使用迭代器遍历集合删除
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String name = iterator.next();
            if(name.contains("B")) {
                list.remove(name);
            }
        }
        System.out.println(list);

        //2.使用增强for遍历 一定会出错，原理也是使用迭代器
    }
}
