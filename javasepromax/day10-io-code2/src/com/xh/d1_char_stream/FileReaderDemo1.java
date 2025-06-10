package com.xh.d1_char_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
//一个个字符读取
public class FileReaderDemo1 {
    public static void main(String[] args) throws IOException {

        try (
            Reader reader = new FileReader("D:\\pvz\\documents\\03JavaAdvanced\\javasepromax\\day10-\\src\\com\\xh\\d1_char_stream\\a.txt");
        ){

//        int c1 = reader.read();
//        System.out.println(c1);
//        int c2 = reader.read();
//        System.out.println(c2);
//        int c3 = reader.read();
//        System.out.println(c3);
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
