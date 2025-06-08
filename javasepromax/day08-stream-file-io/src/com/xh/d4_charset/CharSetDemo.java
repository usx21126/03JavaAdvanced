package com.xh.d4_charset;

import java.io.IOException;
import java.util.Arrays;

public class CharSetDemo {
    public static void main(String[] args) throws IOException {
        //掌握字符编码解码
        String info = "听我吹nb";
        //1.编码成字节
        byte[] bytes = info.getBytes(); //默认UTF-8
        System.out.println(Arrays.toString(bytes));

        byte[] bytes2 = info.getBytes("GBK"); //GBK
        System.out.println(Arrays.toString(bytes2));

        //2.解码成字符
        String rs1 = new String(bytes); //utf-8 -> utf-8
        System.out.println(rs1);
        String rs2 = new String(bytes2);//GBK -> utf-8
        System.out.println(rs2);
        String rs3 = new String(bytes, "GBK");  //utf-8 -> GBK
        System.out.println(rs3);
        String rs4 = new String(bytes2, "GBK"); //GBK -> GBK
        System.out.println(rs4);
    }
}
