package com.xh.d10_extends_modifier2;

import com.xh.d9_extends_modifier.Fu;

public class Zi extends Fu {
    public void print(){
        protectedMethod();
        publicMethod();
    }

    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.print();
    }
}
