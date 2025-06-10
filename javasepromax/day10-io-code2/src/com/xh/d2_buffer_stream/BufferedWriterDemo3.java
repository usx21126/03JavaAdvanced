package com.xh.d2_buffer_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class BufferedWriterDemo3 {
    public static void main(String[] args) {
        try(
            Writer writer = new FileWriter("day10-io-code2\\src\\com\\xh\\d1_char_stream\\b.txt");
            BufferedWriter bw = new BufferedWriter(writer);
        ) {

            bw.write(97);
            bw.write("形");
            bw.write("哇塞怎么八点四十五了",0,4);
            bw.write("\r\n");
            char[] chars = "tongtongtong".toCharArray();
            bw.write(chars,0,3);
            bw.newLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
