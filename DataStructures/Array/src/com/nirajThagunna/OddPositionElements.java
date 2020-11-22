// Java program to print the elements of an array present on odd position
package com.nirajThagunna;

import java.io.IOException;

public class OddPositionElements extends Array1D {

    public static void main(String[] args) throws IOException {

        // Size of an array
        System.out.print("How many elements do you want to store?  ");
        int MAX = UserIO.readInteger();

        // Declaring and initializing an array
        int []arr = readArray(MAX);

        // Displaying the original array
        System.out.println("Original Array : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Printing the elements present on odd position
        System.out.println("Elements of a given array present on odd position : ");

        // First Method
        for (int i = 0; i < MAX; i += 2) {
            System.out.print(arr[i] + " ");
        }

        // Second method
//        for (int i = 0; i < MAX; i++) {
//            if (i % 2 == 0) {
//                System.out.print(arr[i] + " ");
//            }
//        }
    }
}
