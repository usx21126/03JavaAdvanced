package com.xh.d1_byte_stream;

import java.io.*;

public class FileInputStreamDemo3 {
    public static void main(String[] args) throws IOException {

        InputStream is = new FileInputStream("day09-io-code\\src\\com\\xh\\d1_byte_stream\\xh03.txt");
//        File f = new File("day09-io-code\\src\\com\\xh\\d1_byte_stream\\xh03.txt");
//        byte[] buf = new byte[(int) f.length()];
//        int read = is.read(buf);
//        System.out.println(new String(buf));

        byte[] buf2 = is.readAllBytes();
        System.out.println(new String(buf2));
        is.close();
    }
}
