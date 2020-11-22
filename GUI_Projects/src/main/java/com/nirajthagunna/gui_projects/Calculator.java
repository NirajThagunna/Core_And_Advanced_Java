package com.nirajthagunna.gui_projects;

/**
 *
 * @author niraj
 */
public class Calculator {
    
    double num1;
    double num2;
    double num3;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        num3 = 0;
    }

    public double getNum3() {
        return num3;
    }

    public double doSum() {
        num3 = num1 + num2;
        return num3;
    }

    public double doSubtraction() {
        num3 = num1 - num2;
        return num3;
    }

    public double doDivision() {
        num3 = num1 / num2;
        return num3;
    }

    public double doMultiply() {
        num3 = num1 * num2;
        return num3;
    }
}