package com.nirajThagunna;

import java.io.IOException;

public class CalculatorV2 {

    public static void main(String[] args) throws IOException {

        double num1, num2;
        int choice;
        System.out.println("************* Calculator *************\n");

        while (true) {

            System.out.println("Main Menu");
            System.out.println("1. Addition");
            System.out.println("2. Difference");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Sqrt");
            System.out.print("Enter your choice(0 -> Exit) : ");

            choice = BasicIO.readInteger();

            if (choice >= 1 && choice <=5) {

                System.out.print("Enter first number : ");
                num1 = BasicIO.readDouble();
                System.out.print("Enter second number : ");
                num2 = BasicIO.readDouble();

                Calculator calc = new Calculator(num1, num2);

                switch (choice) {
                    case 1:
                        calc.doSum();
                        System.out.printf("The sum of %.2f and %.2f is : %.2f\n\n",
                                num1,num2,calc.getSum());
                        break;

                    case 2:
                        calc.doDiff();
                        System.out.printf("The difference of %.2f and %.2f is : %.2f\n\n",
                                num1,num2,calc.getDifference());
                        break;

                    case 3:
                        calc.doMultiply();
                        System.out.printf("The product of %.2f and %.2f is : %.2f\n\n",
                                num1,num2,calc.getMultiply());
                        break;

                    case 4:
                        calc.findDivision();
                        System.out.printf("The division of %.2f and %.2f is : %.2f\n\n",
                                num1,num2,calc.getDivision());
                        break;

                    case 5:
                        calc.findPower();
                        System.out.printf("The power of %.0f and %.0f is : %.0f\n\n",
                                num1,num2,calc.getPower());
                        break;

                    default:
                        System.out.println("Please enter the valid input !");
                }
            }
            else if (choice == 6) {
                System.out.print("Enter any number : ");
                int num = BasicIO.readInteger();
                double sqrt = Math.sqrt(num);
                System.out.printf("Square root of %d is : %.2f\n\n",num,sqrt);
            }
            else {
                if (choice == 0) {
                    System.exit(0);
                }
                else {
                    System.out.println("Please enter the valid input !\n\n");
                }
            }
        }
    }
}
