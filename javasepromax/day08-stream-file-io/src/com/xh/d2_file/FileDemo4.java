package com.xh.d2_file;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\MSI_NB\\Pictures");
        String[] paths = f.list();
        File[] files = f.listFiles();
        for(String path : paths){
            System.out.println(path);
        }
        System.out.println(paths.length);
        System.out.println("-----------------------------");
        for (File file : files) {
            System.out.println(file.getName());
        }
        System.out.println(files.length);
    }
}
