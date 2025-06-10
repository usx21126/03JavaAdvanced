package com.xh.d6_object;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectInputStreamDemo2 {
    public static void main(String[] args) {

        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day10-io-code2\\src\\com\\xh\\d6_object\\data.txt"));
                ){
//            Student s =(Student) ois.readObject();
            ArrayList<Student> students = (ArrayList<Student>) ois.readObject();
            System.out.println(students);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
