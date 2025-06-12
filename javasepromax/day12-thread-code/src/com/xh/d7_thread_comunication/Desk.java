package com.xh.d7_thread_comunication;

import lombok.Data;

@Data

public class Desk {
    private String data;
    //消费
    public synchronized void get() throws InterruptedException {
        String name = Thread.currentThread().getName();
        if(data == null){
            this.notifyAll();
            this.wait();
        }else{
            System.out.println(name+"消费了"+data);
            data = null;
            this.notifyAll();
            this.wait();
        }

    }
    //生产
    public synchronized void put() throws InterruptedException {
        String name = Thread.currentThread().getName();
        if(data == null){
            this.data = name+"生产的";
            System.out.println(name+"生产了一个产品");
            this.notifyAll();
            this.wait();
        }else{
            this.notifyAll();
            this.wait();
        }
    }
}
