package com.xh.d2_file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {

        //1.文件
        File f1 = new File("C:\\Users\\MSI_NB\\Pictures\\148ECE930D9A00A0E5DB4965F705B997.jpg");
        System.out.println(f1.length());
        //2.文件夹
        File f2 = new File("C:\\Users\\MSI_NB\\Pictures");
        System.out.println(f2.length());
        //3.不存在路径
        File f3 = new File("C:\\Users\\MSI_NB\\Pictures\\fcd.txt");
        System.out.println(f3.length());

        //4.相对路径 默认工程文件
        File f4 =new File(".\\day08-stream-file-io\\src\\com\\xh\\d2_file\\FileDemo1.java");
        System.out.println(f4.length());
    }
}
