package com.xh.d2_reflect;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test4Method {
    @Test
    public void testGetMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class s = Student.class;
        Method[] methods = s.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName()+":"+m.getParameterTypes().length);
        }
        System.out.println("===========");
        Method m1 = s.getDeclaredMethod("getAge");
        Method m2 = s.getDeclaredMethod("setAge", int.class);
        System.out.println(m1.getName());   //getAge
        System.out.println(m2.getName());   //setAge
        System.out.println("===========");
        Student s1 = new Student();
        Object invoke1 = m1.invoke(s1);
        System.out.println(invoke1);    //0
        Object invoke2 = m2.invoke(s1, 13);
        System.out.println(invoke2);    //null
        System.out.println(m1.invoke(s1));  //13
    }
}
