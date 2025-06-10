package com.xh.d5_dataOutputStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo1 {
    public static void main(String[] args) {


        try(
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("day10-io-code2\\src\\com\\xh\\d5_dataOutputStream\\data.txt"));

        ) {
            dos.writeByte(97);
            dos.writeInt(13);
            dos.writeDouble(3.1415);
            dos.writeUTF("Hello");
            dos.write(new byte[]{98,99,100});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
