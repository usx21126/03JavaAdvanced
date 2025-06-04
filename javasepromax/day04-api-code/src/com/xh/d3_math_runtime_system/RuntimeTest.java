package com.xh.d3_math_runtime_system;

import java.io.IOException;
import java.util.Scanner;

public class RuntimeTest {
    public static void main(String[] args) throws IOException {

        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime);
//        runtime.exit(0);
        System.out.println("结束");
        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.freeMemory()/1024/1024+"MB");
        System.out.println(runtime.totalMemory()/1024/1024+"MB");
        System.out.println(runtime.maxMemory()/1024/1024+"MB");

        //启动计算器后返回一个进程对象
        Process process =runtime.exec("calc");
        System.out.println("是否关闭？");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.next();

        switch (command) {
            case "y":
                process.destroyForcibly();
                break;
            default:
                System.out.println("取消");
                break;
        }
        System.out.println(process.isAlive());
    }
}
