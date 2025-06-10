package com.xh.d1_char_stream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
//一次读取数组长度字符
public class FileReaderDemo2 {
    public static void main(String[] args) throws IOException {


        Reader reader = new FileReader("D:\\pvz\\documents\\03JavaAdvanced\\javasepromax\\day10-io-code2\\src\\com\\xh\\d1_char_stream\\a.txt");
        char[] buffer = new char[3];

        int c;
        while((c=reader.read(buffer))!=-1){
            System.out.print(new String(buffer,0,c));
        }
        reader.close();
    }
}
