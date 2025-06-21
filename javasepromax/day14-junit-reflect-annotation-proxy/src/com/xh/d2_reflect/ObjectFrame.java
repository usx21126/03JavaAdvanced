package com.xh.d2_reflect;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.reflect.Field;

public class ObjectFrame {
    public static void save(Object object) throws Exception {
        PrintWriter pw = new PrintWriter(new FileWriter("day14-junit-reflect-annotation-proxy/src/obj.txt",true));
        Class c = object.getClass();
        String className = c.getSimpleName();
        pw.println("============"+className+"============");
        Field[] declaredFields = c.getDeclaredFields();
        for (Field field : declaredFields) {
            String fieldName = field.getName();
            field.setAccessible(true);
            String fieldValue = field.get(object).toString();
            pw.println(fieldName+":"+fieldValue);

        }
        pw.close();
    }
}
