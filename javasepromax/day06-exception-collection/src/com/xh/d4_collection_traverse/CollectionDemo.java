package com.xh.d4_collection_traverse;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("古力娜扎");
        list.add("迪丽热妈");
        list.add("丑笔畅");
        System.out.println(list);

        Iterator<String> it = list.iterator();

//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
