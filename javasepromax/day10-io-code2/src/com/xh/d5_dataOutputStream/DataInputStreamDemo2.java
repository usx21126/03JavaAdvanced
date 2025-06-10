package com.xh.d5_dataOutputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamDemo2 {
    public static void main(String[] args) {

        try(
                DataInputStream dis = new DataInputStream(new FileInputStream("day10-io-code2\\src\\com\\xh\\d5_dataOutputStream\\data.txt"));
                ){
            System.out.println(dis.readByte());
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readUTF());
            byte[] b = new byte[3];
            dis.read(b);
            System.out.println(new String(b));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
