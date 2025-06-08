package com.xh.d2_file;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\MSI_NB\\Pictures\\aaa.txt");
//        System.out.println(f.createNewFile());
        System.out.println(f.delete());
    }
}
