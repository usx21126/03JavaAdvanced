package com.xh.d5_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list);
        //1.for循环
        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            System.out.println(ele);
        }

        //2.迭代器
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String ele = iterator.next();
            System.out.println(ele);
        }

        //3.增强for循环
        for(String s:list){
            System.out.println(s);
        }

        //4.lambda
        list.forEach(s->System.out.println(s));
        System.out.println(list);
    }
}
