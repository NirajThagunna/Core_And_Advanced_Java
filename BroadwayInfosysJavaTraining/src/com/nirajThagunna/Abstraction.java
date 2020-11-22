package com.nirajThagunna;

abstract class Vehicle1 {
    String name;
    // Constructor
    public Vehicle1(String name) {
        this.name = name;
    }
    // abstract method
    abstract void run();
    // Non-abstract method
    public void display() {
        System.out.println(name);
    }
}

class Car1 extends Vehicle1 {

    public Car1(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("Car is running !");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Car1 car1 = new Car1("car");
        car1.display();
        car1.run();
    }
}
