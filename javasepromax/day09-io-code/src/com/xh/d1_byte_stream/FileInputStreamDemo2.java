package com.xh.d1_byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {

        //1.创建文件字节输入流
        InputStream is = new FileInputStream("day09-io-code\\src\\com\\xh\\d1_byte_stream\\xh02.txt");

        //2.
//        byte[] buf = new byte[3];
//        int len1 = is.read(buf);
//        System.out.println(len1);
//        System.out.println(new String(buf));
//
//        int len2 = is.read(buf);
//        System.out.println(len2);
//        System.out.println(new String(buf));
//
//        int len3 = is.read(buf);
//        System.out.println(len3);
//        System.out.println(new String(buf));

        //3.循环改进
        byte[] buffer = new byte[3];
        int len;
        while ((len = is.read(buffer)) != -1) {
            System.out.print(new String(buffer,0,len));
        }
        is.close();
    }
}
