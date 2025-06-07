package com.xh.d3_collection_test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Lombok 使用注释简化get set 有参无参构造器写法
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card implements Comparable<Card>{
    @Override
    public int compareTo(Card o) {
        return this.size-o.size;
    }

    private String color;
    private String number;
    private int size;

    @Override
    public String toString() {
        return color+number;
    }

}
