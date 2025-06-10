package com.xh.d6_object;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class ObjectOutputStreamDemo1 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();
        Student s1 = new Student("凤驴子",27,"mazi666",169);
        Student s2 = new Student("凤驴子",27,"mazi666",169);
        Student s3 = new Student("凤驴子",27,"mazi666",169);
        Collections.addAll(students, s1, s2, s3);
        try(
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day10-io-code2\\src\\com\\xh\\d6_object\\data.txt"));
        ){
            oos.writeObject(students);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
