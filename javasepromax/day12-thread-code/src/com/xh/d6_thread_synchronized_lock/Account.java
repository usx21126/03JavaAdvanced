package com.xh.d6_thread_synchronized_lock;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data

@NoArgsConstructor
public class Account {
    private String cardId;
    private double money;

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    private final Lock lock = new ReentrantLock();
    public void drawMony(double money) {
        String name = Thread.currentThread().getName();

        try {
            lock.lock();
            if(this.money >= money){
                System.out.println(name+"取钱成功，吐出"+money);
                this.money -= money;
                System.out.println("账户余额：" + this.money);
            }else{
                System.out.println(name+"来取钱，余额不足");
            }
        } finally {
            lock.unlock();
        }

    }
}
