package com.xh.d2_reflect;

import org.junit.Test;

public class Test5Frame {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("lihua",32);
        Teacher t1 = new Teacher("Teacher.Ma",9999.9);

        ObjectFrame.save(s1);
        ObjectFrame.save(t1);
    }
}
