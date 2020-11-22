package com.nirajThagunna;

public class Calculator {
    private double num1;
    private double num2;
    private double sum;
    private double difference;
    private double multiply;
    private double division;
    private double power;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // getter
    public double getSum() {
        return sum;
    }
    public double getDifference() {
        return difference;
    }
    public double getMultiply() {
        return multiply;
    }
    public double getDivision() {
        return division;
    }
    public double getPower() {
        return power;
    }

    // setter
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    // Process
    public void doSum() {
        sum = (int) num1 + num2;
    }
    public void doDiff() {
        difference = (int) num1 - num2;
    }
    public void doMultiply() {
        multiply = (int) num1 * num2;
    }
    public void findDivision() {
        division = num1 / num2;
    }
    public void findPower() {
        power = (int) Math.pow(num1, num2);
    }
}
