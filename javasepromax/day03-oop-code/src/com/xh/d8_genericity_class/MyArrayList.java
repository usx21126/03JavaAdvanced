package com.xh.d8_genericity_class;

import java.util.ArrayList;

public class MyArrayList<E> {
    ArrayList<E> list =new ArrayList<>();

    public boolean add(E e) {
        list.add(e);
        return true;
    }
    public boolean remove(E e) {
        return list.remove(e);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
