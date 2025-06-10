package com.xh.d1_properties;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.function.BiConsumer;

public class PropertiesDemo1 {
    public static void main(String[] args) {


        //1.创建属性对象 代表一个文件
        Properties prop = new Properties();
        //2.加载内容

        try {
            prop.load(new FileReader("day11-special-files-log-code\\src\\com\\xh\\d1_properties\\user.properties"));
            //打印
            System.out.println(prop);
            //键取值
            System.out.println(prop.getProperty("name"));
            System.out.println(prop.getProperty("password"));
            System.out.println(prop.getProperty("admin"));
            System.out.println(prop.getProperty("地址"));
            Set<String> keys = prop.stringPropertyNames();
            for(String key : keys){
                System.out.println(key+"==>"+prop.getProperty(key));
            }
            //遍历
            prop.forEach(( s1,  s2) -> System.out.println(s1 + "->" + s2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
