package com.xh.d6_map_impl;

import java.util.*;

import static javax.swing.UIManager.put;

public class MapTest {
    public static void main(String[] args) {
        Map<String, List<String>> provinces = new HashMap<>();

        addProvince(provinces,"江苏省", "南京市", "扬州市", "苏州市", "常州市");
        addProvince(provinces,"湖北省", "武汉市", "宜昌市", "十堰市", "孝感市");
        addProvince(provinces,"河北省", "唐山市", "石家庄市", "邢台市", "保定市");
        provinces.forEach((k, v) -> System.out.println(k + "\t" + v));
    }
    public static void addProvince(Map<String, List<String>> provinces,String provinceName,String... provinceList){
        List<String> province = new ArrayList<>();
        Collections.addAll(province,provinceList);
        provinces.put(provinceName,province);
    }
}
