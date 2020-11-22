// Java program to print the elements of an array present on even position
package com.nirajThagunna;

import java.io.IOException;

public class EvenPositionElements extends Array1D {

    public static void main(String[] args) throws IOException {

        // Size of an array
        System.out.print("How many elements do you want to store?  ");
        int MAX = UserIO.readInteger();

        int []arr = readArray(MAX);

        // Displaying an original array
        System.out.println("Original Array : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Printing the only elements present at even position
        System.out.println("Elements of given array present on even position : ");

//        First Method
//        for (int i = 1; i < MAX; i++) {
//            if (i % 2 != 0) {
//                System.out.print(arr[i] + " ");
//            }
//        }

        // Second Method
        for (int i = 1; i < MAX; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
