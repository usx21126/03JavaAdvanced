package com.xh.d3_transfer_stream;

import java.io.*;

public class InputStreamReaderDemo2 {
    public static void main(String[] args) {
        try(
                InputStream in = new FileInputStream("day10-io-code2\\src\\com\\xh\\d3_transfer_stream\\abc.txt");
                Reader isr = new InputStreamReader(in,"GBK");
                //把字符输入流包装成高级缓冲字符输入流
                BufferedReader br = new BufferedReader(isr);
        ){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
