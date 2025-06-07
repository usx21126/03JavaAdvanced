package com.xh.d5_map_travesal;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo2 {
    public static void main(String[] args) {

        Map<String,Integer> map = new TreeMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        System.out.println(map);

        Set<Map.Entry<String,Integer>> set = map.entrySet();
        for (Map.Entry<String,Integer> entry : set) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }
}
