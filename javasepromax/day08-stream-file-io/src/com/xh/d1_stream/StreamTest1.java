package com.xh.d1_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //1.存到新集合
        List<String> newList = new ArrayList<>();
        for(String s : list){
            if(s.startsWith("张")){
                newList.add(s);
            }
        }
        System.out.println(newList);

        //2.stream流改进
        list = list.stream().filter(s -> (s.startsWith("张")) && s.length() ==3).collect(Collectors.toList());
        System.out.println(list);
    }
}
