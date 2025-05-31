package com.xh.d1_innerclass1;

public class Outer {
    public static String schoolName = "School Name";
    public static void inAddr(){
        System.out.println("In Address");
    }
    private String hobby;
    private double height;
    public void run(){
        System.out.println("run");
    }
    public class Inner {
        private String name;
        private int age;
        public void show(){
            //成员内部类可以调用外部类的静态成员
            System.out.println(schoolName);
            inAddr();
            System.out.println(hobby);
            System.out.println(height);
            run();
        }
        public Inner() {
        }

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
