package com.xh.d12_integer;

public class Test {
    public static void main(String[] args) {
        int a = 12;

        //Integer it1 = new Integer(a);     //过时
        Integer it1 = Integer.valueOf(a);   //手动包装
        System.out.println(it1);

        // 2.自动装箱机制 -128至127存在缓存，其他
        Integer it2 = 128;   //等价手动包装
        Integer it3 = 128;
        System.out.println(it2 == it3);

        int it4 = 128;
        System.out.println(it4 == it2); //自动拆箱，比较的值，不是引用
        System.out.println("----------------------------");
        // 1.int -> String
        int x = 123;
        String s = Integer.toString(x);
        System.out.println(s);

        String s2 = String.valueOf(x);
        System.out.println(s2);

        // 2.String -> int
        String s3 = "123";
        int i = Integer.parseInt(s3);
        System.out.println(i);
        int i2 = Integer.valueOf("123");
        System.out.println(i2);

        // 3.String -> double
        String s4 = "123.31";
        double d = Double.parseDouble(s4);
        System.out.println(d);
        double d2 = Double.valueOf(s4);
        System.out.println(d2);
    }
}
