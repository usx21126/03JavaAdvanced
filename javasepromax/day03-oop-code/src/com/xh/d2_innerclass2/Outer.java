package com.xh.d2_innerclass2;

public class Outer {
    public static String schoolName = "School Name";
    public static void inAddr(){
        System.out.println("In Address");
    }
    private String hobby;
    public void hello(){
        System.out.println("Hello");
    }

    public static class Inner {
        private String name;
        private int age;
        public void show(){
            System.out.println(schoolName);
            inAddr();
            //System.out.println(hobby);  //报错
            Outer outer = new Outer();
            System.out.println(outer.hobby);    //间接访问
            //hello(); //报错
            outer.hello(); //间接访问
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
