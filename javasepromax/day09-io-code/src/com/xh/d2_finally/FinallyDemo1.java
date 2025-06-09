package com.xh.d2_finally;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FinallyDemo1 {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try{
            is = new FileInputStream("C:\\Users\\MSI_NB\\Pictures\\312.png");
            os =new FileOutputStream("C:\\Users\\MSI_NB\\Pictures\\3122.png");
            byte[] buffer = is.readAllBytes();
            os.write(buffer);
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(is != null) is.close();
            }catch (Exception e){
                e.printStackTrace();
            }
            try{
                if(os != null) os.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
