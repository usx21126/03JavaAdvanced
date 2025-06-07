package com.xh.d5_map_travesal;

import java.util.*;

public class MapTest4 {
    public static void main(String[] args) {
        String[] location = {"玉龙雪山","伶仃岛","三亚","泰国"};

        List<String> data = new ArrayList<String>();
        Random rand = new Random();
        for (int i = 0; i < 80; i++) {
            data.add(location[rand.nextInt(location.length)]);
        }
        System.out.println(data);

        Map<String, Integer> map = new HashMap<>();
        for(String s : data) {
            if(map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            }
            else {
                map.put(s, 1);
            }
        }

        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
