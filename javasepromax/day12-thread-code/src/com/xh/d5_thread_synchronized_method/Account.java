package com.xh.d5_thread_synchronized_method;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String cardId;
    private double money;
    public synchronized void drawMony(double money) {
        String name = Thread.currentThread().getName();
            if(this.money >= money){

                System.out.println(name+"取钱成功，吐出"+money);
                this.money -= money;
                System.out.println("账户余额：" + this.money);
            }else{
                System.out.println(name+"来取钱，余额不足");
            }

    }
}
