package com.xh.d2_buffer_stream;

import java.io.*;
import java.util.Timer;

//原始流与缓冲流性能分析
public class TimerTest5 {
    public static final String SRC_VEDIO = "D:\\CloudMusic\\大碗宽面 - 吴亦凡.mp3";
    public static final String DEST_PATH = "D:\\CloudMusic\\zz";
    public static void main(String[] args) {
//        1.使用低级的字节流按照一个一个字节的形式复制文件。
//        2.使用低摄的字节流按照字节数组的形式复制文件。
//        3.使用高级的缓冲字节流按照一个一个字节的形式复制文件
//        4.使用高级的缓冲字节浓流照字节数组的形式复制文件
                    //1KB       32KB        128KB
//        copy01(); //很久
        copy02();   //0.072s    0.009s      0.007s
        copy03();   //0.367s    0.399s      0.381s
        copy04();   //0.015s    0.006s      0.006s

    }
    private static void copy01() {
        long start = System.currentTimeMillis();

        try(
                InputStream in = new FileInputStream(SRC_VEDIO);
                OutputStream out = new FileOutputStream(DEST_PATH+"\\01.mp3");
        ){

            int buf ;
            while((buf=in.read()) != -1){
                out.write(buf);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("用时："+(end - start)/1000.0+"s");
    }
    private static void copy02() {
        long start = System.currentTimeMillis();

        try(
                InputStream in = new FileInputStream(SRC_VEDIO);
                OutputStream out = new FileOutputStream(DEST_PATH+"\\02.mp3");
        ){

            byte[] buf = new byte[128*1024];
            int len;
            while((len=in.read(buf)) != -1){
                out.write(buf, 0, len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("用时："+(end - start)/1000.0+"s");
    }
    private static void copy03() {
        long start = System.currentTimeMillis();

        try(
                InputStream in = new FileInputStream(SRC_VEDIO);
                InputStream bis = new BufferedInputStream(in);
                OutputStream out = new FileOutputStream(DEST_PATH+"\\03.mp3");
                OutputStream bos = new BufferedOutputStream(out);
        ){

            int buf ;
            while((buf=bis.read()) != -1){
                bos.write(buf);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("用时："+(end - start)/1000.0+"s");
    }
    private static void copy04() {
        long start = System.currentTimeMillis();

        try(
                InputStream in = new FileInputStream(SRC_VEDIO);
                InputStream bis = new BufferedInputStream(in);
                OutputStream out = new FileOutputStream(DEST_PATH+"\\04.mp3");
                OutputStream bos = new BufferedOutputStream(out);
        ){

            byte[] buf = new byte[128*1024];
            int len;
            while((len=bis.read(buf)) != -1){
                bos.write(buf, 0, len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("用时："+(end - start)/1000.0+"s");
    }
}
