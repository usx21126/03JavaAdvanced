package com.xh.d8_demo;

public class BeerDemo3 {
    public static void main(String[] args) {

        //啤酒一瓶2元，4个盖子换一瓶，2个空瓶换一瓶，10元可以喝多少瓶，剩余多少盖子和空瓶

        buy(10);
    }

    public static void buy(int money){
        int number = money/2;
        int bottle = number;
        int lib = number;
        while(bottle>=2 || lib>=4){
            int add = bottle/2+lib/4;
            bottle%=2;
            lib%=4;
            number+=add;
            bottle+=add;
            lib+=add;
        }
        System.out.println("买"+number+"瓶");
        System.out.println("剩余"+bottle+"瓶子");
        System.out.println("剩余"+lib+"瓶盖");
    }
}
