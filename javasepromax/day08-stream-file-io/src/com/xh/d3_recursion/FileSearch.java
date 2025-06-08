package com.xh.d3_recursion;

import java.io.File;
import java.io.IOException;

public class FileSearch {
    public static void main(String[] args)throws IOException {
        File dir = new File("C:\\");
        searchFile(dir,"QQ.exe");
        System.out.println("结束");
    }

    /**
     * 文件搜索
     * @param dir   被搜索文件夹
     * @param s     被搜索文件名
     */
    private static void searchFile(File dir, String s) throws IOException {
        if(dir == null || !dir.exists() || dir.isFile() ){
            return;
        }
        File[] files = dir.listFiles();
        if(files == null||files.length == 0){
            return;
        }
        for(File file : files){
            if(file.isFile()){
                if(file.getName().equals(s)) {
                    System.out.println(file.getAbsolutePath());
                    Runtime runtime = Runtime.getRuntime();
                    runtime.exec(file.getAbsolutePath());
                }
            }else{
                searchFile(file,s);
            }
        }
    }
}
