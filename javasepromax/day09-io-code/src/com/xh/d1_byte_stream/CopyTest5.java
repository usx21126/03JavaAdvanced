package com.xh.d1_byte_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyTest5  {
    public static void main(String[] args) {


        try{
            InputStream is = new FileInputStream("C:\\Users\\MSI_NB\\Pictures\\312.png");
            OutputStream os =new FileOutputStream("C:\\Users\\MSI_NB\\Pictures\\3122.png");

            byte[] buffer = is.readAllBytes();
            os.write(buffer);
            os.close();
            is.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
