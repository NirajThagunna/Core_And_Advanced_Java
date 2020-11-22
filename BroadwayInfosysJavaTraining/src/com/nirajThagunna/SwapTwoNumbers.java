package com.nirajThagunna;

import java.io.IOException;

public class SwapTwoNumbers {
    public static void main(String[] args) throws IOException {
        int num1, num2, temp;
        System.out.print("Enter first number : ");
        num1 = BasicIO.readInteger();
        System.out.print("Enter second number : ");
        num2 = BasicIO.readInteger();

        System.out.println("Numbers before swapping : \n" + "num1 = " +num1
        +" and num2 = " +num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Numbers after swapping : \n" + "num1 = " +num1
                +" and num2 = " +num2);
    }
}
