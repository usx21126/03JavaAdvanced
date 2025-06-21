package com.xh.d2_reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test2Constructor {

    @Test
    public void testGetConstructors(){
        Class s1 = Student.class;
//        Constructor[] constructors = s1.getConstructors();
        Constructor[] constructors = s1.getDeclaredConstructors();
        for(Constructor c : constructors){
            System.out.println(c.getName()+"==>"+c.getParameterCount());
        }
    }
    @Test
    public void testGetConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class s1 = Student.class;

        //获得无参构造器
        Constructor constructor1 = s1.getDeclaredConstructor();
        System.out.println(constructor1.getName()+"==>"+constructor1.getParameterCount());
        //获得有参构造器
        Constructor constructor2 = s1.getDeclaredConstructor(String.class, int.class);
        System.out.println(constructor2.getName()+"==>"+constructor2.getParameterCount());

        //获得构造器的目的：初始化对象返回
        Student s2 = (Student) constructor1.newInstance();
        System.out.println(s2);

        Student s3 = (Student) constructor2.newInstance();
        System.out.println(s3);

    }
}
