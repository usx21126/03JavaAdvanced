package com.xh.d4_print_stream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo1 {
    public static void main(String[] args) {
        try(
                PrintStream os = new PrintStream("day10-io-code2\\src\\com\\xh\\d4_print_stream\\aaa.txt");
//                PrintStream os = new PrintStream(new FileOutputStream("day10-io-code2\\src\\com\\xh\\d4_print_stream\\aaa.txt",true));

        ){
            os.println("Hello World");
            os.println(123);
            os.println(12.3);

            os.println(true);
            os.println(false);
            System.out.println(1);
            System.out.println(2);
            System.setOut(os);
            System.out.println(3);
            System.out.println(4);
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
