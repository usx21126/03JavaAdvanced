package com.xh.d1_char_stream;

import java.io.FileWriter;
import java.io.Writer;
//字符输出流方法
public class FileWriteDemo3 {
    public static void main(String[] args) {


        try(
           Writer writer = new FileWriter("day10-io-code2\\src\\com\\xh\\d1_char_stream\\b.txt");
        ) {

            writer.write(97);
            writer.write("形");
            writer.write("哇塞怎么八点四十五了",0,4);
            writer.write("\r\n");
            char[] chars = "tongtongtong".toCharArray();
            writer.write(chars,0,3);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
