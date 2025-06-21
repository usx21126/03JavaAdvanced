package com.xh.d3_annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationDemo3 {
    @Test
    public void parseClass() {
        //注解解析
        Class c = Demo.class;
        //1.判断类是否陈列该注解
        if(c.isAnnotationPresent(MyTest4.class)){
            //2.得到注解对象
            MyTest4 myTest4 =(MyTest4) c.getDeclaredAnnotation(MyTest4.class);
            System.out.println(myTest4.value());
            System.out.println(myTest4.aaa());
            System.out.println(myTest4.bbb());
        }
    }
    @Test
    public void parseMethod() throws Exception {
        //注解解析
        Method m = Demo.class.getDeclaredMethod("test1");

        if(m.isAnnotationPresent(MyTest4.class)){
            System.out.println(m.getName());
            MyTest4 myTest4 =m.getDeclaredAnnotation(MyTest4.class);
            System.out.println(myTest4.value());
            System.out.println(myTest4.aaa());
            System.out.println(myTest4.bbb());
        }


    }
}
@MyTest4(value = "lll",aaa = 999,bbb = {"阿猫","阿狗"})
class Demo{
    @MyTest4(value = "ll",aaa = 13,bbb = {"阿猫","阿狗"})
    public void test1(){

    }
}
