package com.xh.d2_buffer_stream;

import java.io.*;
import java.util.Arrays;

public class BufferedInputStreamDemo1 {
    public static void main(String[] args) throws IOException {

        try(
                InputStream is = new FileInputStream("day09-io-code\\src\\com\\xh\\d1_byte_stream\\xh03.txt");
                InputStream buf = new BufferedInputStream(is);
        ) {
            byte[] buffer = buf.readAllBytes();
            System.out.println(new String(buffer));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
