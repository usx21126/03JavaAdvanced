package com.xh.d3_transfer_stream;

import java.io.*;

//不同编码下，字符流文件内容显示问题
public class Test1 {
    public static void main(String[] args) {

        try(
            Reader r = new FileReader("day10-io-code2\\src\\com\\xh\\d3_transfer_stream\\abc.txt");
            BufferedReader br = new BufferedReader(r);
        ) {
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
