package com.xh.d5_map_travesal;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo1 {
    public static void main(String[] args) {

        Map<String,Integer> map = new TreeMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        System.out.println(map);

        for(String key : map.keySet()){
            Integer value = map.get(key);
            System.out.println(key + "-->" + value);
        }
    }
}
