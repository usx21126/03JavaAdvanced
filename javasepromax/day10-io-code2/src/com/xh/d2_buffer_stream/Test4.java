package com.xh.d2_buffer_stream;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//出师表排序
public class Test4 {
    public static void main(String[] args)  {



        try (
                Reader r = new FileReader("day10-io-code2\\src\\com\\xh\\d2_buffer_stream\\csb.txt");
                BufferedReader br = new BufferedReader(r);
                Writer w = new FileWriter("day10-io-code2\\src\\com\\xh\\d2_buffer_stream\\csb-new.txt");
                BufferedWriter bw = new BufferedWriter(w);
        ){
            //读到数组
            List<String> list = new ArrayList<>();
            String line;
            while((line = br.readLine())!=null){
                list.add(line);
            }
            System.out.println(list);

            //排序
            Collections.sort(list, Comparator.comparingInt(o -> Integer.valueOf(o.split("\\.")[0])));
            System.out.println(list);

            //输出
            for(String s : list){
                bw.write(s);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
