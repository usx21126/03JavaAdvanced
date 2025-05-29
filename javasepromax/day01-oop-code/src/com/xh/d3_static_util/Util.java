package com.xh.d3_static_util;

import java.util.Random;
//工具类
public class Util {
    private Util() {
    }

    public static String createCode(int n) {
        String code = "";
        String data = "0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(data.length());
            char c = data.charAt(index);
            code += c;
        }
        return code;
    }
}
