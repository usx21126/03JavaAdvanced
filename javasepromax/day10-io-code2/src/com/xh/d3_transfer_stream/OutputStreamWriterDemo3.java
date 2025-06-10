package com.xh.d3_transfer_stream;

import java.io.*;

public class OutputStreamWriterDemo3 {
    public static void main(String[] args) {



        try (
            OutputStream os = new FileOutputStream("day10-io-code2\\src\\com\\xh\\d3_transfer_stream\\output.txt");
            Writer osw = new OutputStreamWriter(os,"GBK");
            BufferedWriter bw = new BufferedWriter(osw);
        ){

            bw.write("莫道桑榆晚");
            bw.newLine();
            bw.write("为霞尚满天");
            bw.newLine();
            bw.write("abc666");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
