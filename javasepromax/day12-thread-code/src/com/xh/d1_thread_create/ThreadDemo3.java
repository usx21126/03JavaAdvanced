package com.xh.d1_thread_create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//使用Callable接口和FutureTask类实现
public class ThreadDemo3 {
    public static void main(String[] args) {



        Callable<String> call = new MyCallable(100);
        FutureTask<String> futureTask = new FutureTask<>(call);
        Thread thread = new Thread(futureTask);
        thread.start();
        Callable<String> call2 = new MyCallable(200);
        FutureTask<String> futureTask2 = new FutureTask<>(call2);
        Thread thread2 = new Thread(futureTask2);
        thread2.start();

        try {
            String s1 = futureTask.get();
            System.out.println(s1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String s2 = futureTask2.get();
            System.out.println(s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


//1.定义类实现Callable接口
class MyCallable implements Callable<String> {
    private int num;
    public MyCallable(int num) {
        this.num = num;
    }
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += i;
        }
        return "子线程求和1-"+num+"的结果是"+sum;
    }
}