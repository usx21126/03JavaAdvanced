package com.xh.d6_set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo5 {
    public static void main(String[] args) {
        Set<Girl> set = new TreeSet<>((o1, o2)-> o2.getAge() - o1.getAge()>=0?1:-1);
        set.add(new Girl("赵敏",'女',21,169.5));
        set.add(new Girl("刘亦菲",'女',34,167.5));
        set.add(new Girl("李若彤",'女',26,168.5));
        set.add(new Girl("张若楠",'女',19,171.5));
        set.add(new Girl("杨幂",'女',34,171.5));

        System.out.println(set);


    }
}
