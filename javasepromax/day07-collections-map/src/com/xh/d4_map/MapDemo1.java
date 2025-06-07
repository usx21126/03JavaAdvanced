package com.xh.d4_map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        System.out.println(map.put("Java入门", 1));
        map.put("华为手表", 31);
        map.put("iphone15",1);
        map.put("mate60",1);
        System.out.println(map.put("iphone15",31));
        map.put("娃娃",1);
        map.put("雨伞",10);
        map.put(null,null);
        System.out.println(map);
    }
}
