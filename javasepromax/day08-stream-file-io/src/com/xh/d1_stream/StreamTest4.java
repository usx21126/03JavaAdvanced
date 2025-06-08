package com.xh.d1_stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest4 {
    public static void main(String[] args) {

        Collection<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张燕", "张三丰");
        list.stream().filter(s -> s.startsWith("张") && s.length() == 3).forEach(System.out::println);

        //1.转list
        List<String> list2 = list.stream().collect(Collectors.toList());
//        List<String> list2 = new ArrayList<>(list);
        System.out.println(list2);
        //2.转set
        Set<String> list3 = list.stream().collect(Collectors.toSet());
        System.out.println(list3);
        //3.转数组
        String[] list4 = (String[]) list.stream().toArray();
        System.out.println(Arrays.toString(list4));

        //4.转map
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("摔跤吧，爸爸", 9.5, "阿米尔汗"));
        movies.add(new Movie("三傻宝莱坞", 8.5, "阿米尔汗2"));
        movies.add(new Movie("三傻宝莱坞", 18.5, "阿米尔汗2"));
        movies.add(new Movie("阿甘正传", 7.5, "汤姆汉克斯 "));

        Map<String,Double> map = movies.stream().collect(Collectors.toMap(m1->m1.getName(),m1->m1.getScore(),(v1,v2)->v2));
        System.out.println(map);
    }
}