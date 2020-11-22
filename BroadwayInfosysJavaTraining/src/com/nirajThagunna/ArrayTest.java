package com.nirajThagunna;

import java.io.IOException;

public class ArrayTest {

    public static void main(String []args) throws IOException {

        String choice;

        System.out.print("How many numbers do you want to store : ");
        int MAX = BasicIO.readInteger();

        // Declaring and Initializing an array
        int numbers[] = new int[MAX];

        // Assigning the values in an array
        for (int i = 0; i < MAX; i++) {
            System.out.print("Enter any number : ");
            numbers[i] = BasicIO.readInteger();
        }

        while (true) {

            System.out.print("What do you want to do?[Access, Sum, Max, Min, Searching] (0 -> Exit)  ");
            choice = BasicIO.dataInput();

            if ("Access".equals(choice)) {
                // Accessing the values of an array
                System.out.print("Elements of an array are : ");
                for (int i = 0; i < MAX; i++) {
                    System.out.print(numbers[i] + "\t");
                }
                System.out.println("\n");
            }

            else if ("Sum".equals(choice)) {
                // Sum of all the elements present in the array
                int sum = 0;
                for (int i = 0; i < MAX; i++) {
                    sum += numbers[i];
                }
                System.out.println("The sum of all the elements of an array is : " + sum + "\n");
            }

            else if ("Max".equals(choice)) {
                int max = Integer.MIN_VALUE;
                for (int i = 0; i < MAX; i++) {
                    if (numbers[i] > max) {
                        max = numbers[i];
                    }
                }
                System.out.println("The maximum value is : " + max + "\n");
            }

            else if ("Min".equals(choice)) {
                int min = Integer.MAX_VALUE;
                for (int i = 0; i < MAX; i++) {
                    if (numbers[i] < min) {
                        min = numbers[i];
                    }
                }
                System.out.println("The minimum value is : " + min + "\n");
            }
            else if ("Searching".equals(choice)) {
                System.out.print("Enter the element you want to search : ");
                int ele = BasicIO.readInteger();
                int flag = 0, i;
                for (i = 0; i < MAX; i++) {
                    if (numbers[i] == ele) {
                        flag = 1;
                        break;
                    }
                    else {
                        flag = 0;
                    }
                }
                if (flag == 1) {
                    System.out.printf("The element %d is found at position %d\n\n",ele,i);
                }
                else {
                    System.out.printf("The element %d is not found\n\n",ele);
                }
            }
            else if (Integer.parseInt(choice) == 0) {
                System.exit(0);
            }
        }
    }
}
