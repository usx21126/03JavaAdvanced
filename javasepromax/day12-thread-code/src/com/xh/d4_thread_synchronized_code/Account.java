package com.xh.d4_thread_synchronized_code;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String cardId;
    private double money;
    public void drawMony(double money) {
        String name = Thread.currentThread().getName();
        synchronized (this) {
            if(this.money >= money){

                System.out.println(name+"取钱成功，吐出"+money);
                this.money -= money;
                System.out.println("账户余额：" + this.money);
            }else{
                System.out.println(name+"来取钱，余额不足");
            }
        }
    }
}
