package com.xh.d1_properties;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo2 {
    public static void main(String[] args) throws IOException {

        Properties prop = new Properties();
        prop.setProperty("admin", "6666");
        prop.setProperty("玄冥老二", "wangfei");
        prop.setProperty("金毛狮王", "成昆");
        System.out.println(prop);

        //2.存储到文件
        //prop.store(new FileWriter("day11-special-files-log-code\\src\\com\\xh\\d1_properties\\user2.properties"),"GG");
        prop.store(new FileOutputStream("day11-special-files-log-code\\src\\com\\xh\\d1_properties\\user2.properties"),"GG");


    }
}
