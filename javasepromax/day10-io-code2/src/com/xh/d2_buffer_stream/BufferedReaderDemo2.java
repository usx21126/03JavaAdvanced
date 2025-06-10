package com.xh.d2_buffer_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderDemo2 {
    public static void main(String[] args) throws IOException {

        Reader reader = new FileReader("day10-io-code2\\src\\com\\xh\\d1_char_stream\\a.txt");
        BufferedReader br = new BufferedReader(reader);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }


        reader.close();
    }
}

