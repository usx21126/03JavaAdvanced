package com.xh.d9_genericity_interface;
//泛型接口
public interface Data<E> {
    void add(E s);
    void remove(E s);
    void update(E s);
    E getById(int id);
}
