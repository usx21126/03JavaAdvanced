package com.xh.d1_byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {

        //1.创建文件字节输入流管道与目标文件接通
        FileInputStream fis = new FileInputStream("day09-io-code/src/com/xh/d1_byte_stream/xh01.txt");

        //2.每次读取1个字节
        int b;
        while ((b = fis.read()) != -1) {
            char ch = (char) b;
            System.out.print(ch);
        }
        fis.close();
        System.out.println();

    }
}
