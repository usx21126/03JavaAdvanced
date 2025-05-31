package com.xh.d10_genericity_method;

import com.xh.d5_enum.A;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<TSL> tsls = new ArrayList<TSL>();
        tsls.add(new TSL());
        tsls.add(new TSL());
        tsls.add(new TSL());
        go(tsls);

        ArrayList<LX> lxes = new ArrayList<LX>();
        lxes.add(new LX());
        lxes.add(new LX());
        lxes.add(new LX());
        go(lxes);

        for (int i = 0; i < lxes.size(); i++) {
            System.out.println(lxes.get(i));
        }
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        //go(dogs);     //报错

    }
    public static void go(ArrayList<? extends Car> cars) {
        System.out.println(cars);
    }
}

class Car{

}
class TSL extends Car{}

class LX extends Car{}
class Dog{}
