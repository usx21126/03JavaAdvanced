package com.xh.d4_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo3 {
    public static void main(String[] args) {

        Collection<String> list = new ArrayList<>();
        list.add("古力娜扎");
        list.add("迪丽热妈");
        list.add("丑笔畅");
//        list.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        list.forEach((String s) -> System.out.println(s));

//        list.forEach((s) -> System.out.println(s));

        list.forEach(System.out::println);

    }
}
