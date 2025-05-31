package com.xh.d5_enum;
//枚举类
public enum A {
    //枚举类第一行必须罗列枚举对象名称

    X,Y,Z;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
