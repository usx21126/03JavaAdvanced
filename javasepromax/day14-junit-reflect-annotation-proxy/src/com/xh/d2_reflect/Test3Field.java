package com.xh.d2_reflect;

import org.junit.Test;

import java.lang.reflect.Field;

public class Test3Field {
    @Test
    public void testGetFields() throws NoSuchFieldException, IllegalAccessException {
        Class s = Student.class;
        Field[] fields = s.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType()+":"+field.getName());
        }
        Field field = s.getDeclaredField("age");
        field.setAccessible(true);
        Student student = new Student();
        //student.setName("lihua"); ↓反射
        field.set(student,24);
        int name = (int)field.get(student);
        System.out.println(name);
    }
}
