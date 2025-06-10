package com.xh.d8_demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteDirDemo2 {
    public static void main(String[] args) {

        //删除文件夹
        try{
            deleteDir(new File("day10-io-code2\\src\\com\\xh\\d8_demo\\bb\\aa"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void deleteDir(File dir) throws IOException {
        if(dir ==null || !dir.exists() || !dir.isDirectory()){
            return;
        }
        File[] files = dir.listFiles();
        if(files==null ){
            return;
        }
        for(File file : files){
            if(file.isDirectory()){
                deleteDir(file);
            }else{
                Files.delete(file.toPath());
            }
        }
        Files.delete(dir.toPath());
    }
}
