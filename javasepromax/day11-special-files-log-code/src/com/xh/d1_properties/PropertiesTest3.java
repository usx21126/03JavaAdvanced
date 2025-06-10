package com.xh.d1_properties;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest3 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("day11-special-files-log-code\\src\\com\\xh\\d1_properties\\people.txt"));
        System.out.println(prop);
        if(prop.containsKey("李芳")){
            prop.setProperty("李芳", "18");
            prop.store(new FileWriter("day11-special-files-log-code\\src\\com\\xh\\d1_properties\\people.txt"),"GG");

        }

    }
}
