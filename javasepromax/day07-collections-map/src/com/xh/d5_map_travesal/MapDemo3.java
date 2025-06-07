package com.xh.d5_map_travesal;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        System.out.println(map);

//        map.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String s, Integer integer) {
//                System.out.println(s + "->" + integer);
//            }
//        });

        map.forEach((s,integer)->System.out.println(s + "->" + integer));
    }
}
