package com.xh.d8_thread_pool;

import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolExecutorDemo2 {
    public static void main(String[] args) {
        //1.创建线程池
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 1, TimeUnit.MINUTES, new LinkedBlockingQueue<>(3),Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        //2.处理任务
        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));

        try {
            String s = f1.get();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String s = f2.get();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String s = f3.get();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
