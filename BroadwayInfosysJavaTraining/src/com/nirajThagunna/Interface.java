package com.nirajThagunna;

interface Vehicle {
    // All the common methods in a vehicle
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Car implements Vehicle {
    private int speed;
    private int gear;

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void speedUp(int increment) {
        this.speed += increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        this.speed -= decrement;
    }

    public void display() {
        System.out.println("Speed : " + speed + "\n" + "Gear : " + gear);
    }
}

class Bike implements Vehicle {
    private static int speed;
    private static int gear;

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void speedUp(int increment) {
        this.speed += increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        this.speed -= decrement;
    }

    public static void display() {
        System.out.println("Speed : " + speed + " \n" +
                "Gear : " + gear);
    }
}
public class Interface {
    public static void main(String[] args) {
        Car car = new Car();
        car.changeGear(2);
        car.speedUp(3);
        car.applyBrakes(1);
        System.out.println("Car's present state : ");
        car.display();

        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);
        System.out.println("Bike's present state : ");
        Bike.display();
    }
}
