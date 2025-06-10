package com.xh.d8_demo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;

import static org.apache.commons.io.FileUtils.copyFile;

//复制文件夹方法
public class CoptDirectoryDemo1 {
    public static void main(String[] args) throws IOException {

        copyDirectory(new File("day10-io-code2\\src\\com\\xh\\d8_demo\\aa"),new File("day10-io-code2\\src\\com\\xh\\d8_demo\\bb"));
    }

    public static void copyDirectory(File source, File dest) throws IOException {
        if(source == null || dest == null || !source.exists()  || !dest.exists() || source.isFile() || dest.isFile()){
            System.out.println("**");
            return;
        }
        //1.拷贝之前，在目标位置创建同名文件夹
        //File newDir = new File(dest+"\\"+source.getName());
        File newDir = new File(dest,source.getName());
        newDir.mkdirs();
        //2.提取文件一级文件对象
        File[] files = source.listFiles();
        if(files == null||files.length == 0){
            return;
        }
        for(File file : files){
            if(file.isDirectory()){
                copyDirectory(file,newDir);
            }else{
                Files.copy(Path.of(file.getPath()),Path.of(newDir.getPath()+"\\"+file.getName()));
            }
        }

    }
}
