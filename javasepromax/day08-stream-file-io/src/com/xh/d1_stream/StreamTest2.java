package com.xh.d1_stream;


import java.util.*;
import java.util.stream.Stream;
// 获取stram流
public class StreamTest2 {
    public static void main(String[] args) {
        //1.获取集合stream流
        Collection<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张燕", "张三丰");
        Stream<String> stream = list.stream();

        System.out.println(stream.count()); //5
        //2.获取Map stream流
        Map<String, Integer> map = new HashMap<>();
        //获取键
        Stream<String> ks1 = map.keySet().stream();
        //获取值
        Stream<Integer> ks2 = map.values().stream();
        //获取键值对
        Stream<Map.Entry<String, Integer>> ks3 = map.entrySet().stream();

        //3.获取数组的stream
        String[] names = {"赵敏","王菲","小昭"};

//        Stream<String> as1 = Arrays.stream(names);
        Stream<String> as1 = Stream.of(names);
        Stream<String> as2 = Arrays.stream(names);
    }
}
