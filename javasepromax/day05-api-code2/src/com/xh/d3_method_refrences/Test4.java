package com.xh.d3_method_refrences;

public class Test4 {
    public static void main(String[] args) {

//        Create c1 = new Create() {
//            @Override
//            public Car createCar(String name) {
//                return new Car(name);
//            }
//        };
//        Car car = c1.createCar("兰博基尼");

//        Create c1 = (name)->  new Car(name);
        Create c1 = Car::new;
        Car car = c1.createCar("兰博基尼");
    }
}
interface Create{
    Car createCar(String name);
}
class Car {
    private String name;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}