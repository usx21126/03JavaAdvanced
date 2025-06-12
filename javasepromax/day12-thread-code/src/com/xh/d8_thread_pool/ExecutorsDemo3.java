package com.xh.d8_thread_pool;

import java.util.concurrent.*;

public class ExecutorsDemo3 {
    public static void main(String[] args) {
        //1.创建线程池
//        ExecutorService pool = new ThreadPoolExecutor(3, 5, 1, TimeUnit.MINUTES, new LinkedBlockingQueue<>(3), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        ExecutorService pool = Executors.newFixedThreadPool(3);

        //2.处理任务
        Runnable runnable = new MyRunnable();
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);//等待队列
        pool.execute(runnable);//等待队列
        pool.execute(runnable);//等待队列
        pool.execute(runnable);//临时线程
        pool.execute(runnable);//临时线程
        pool.execute(runnable);//Exception
    }
}
