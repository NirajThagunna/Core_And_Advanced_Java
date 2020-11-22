// Java program to left rotate an element from a fixed position
package com.nirajThagunna;

import java.io.IOException;

public class ArrayLeftRotation extends Array1D {

    public static void main(String[] args) throws IOException {

        // Size of an array
        System.out.print("How many elements do you want to store?  ");
        int MAX = UserIO.readInteger();

        int []arr = readArray(MAX);

        // n determine the number of times an array should be rotated
        System.out.print("Enter the position of an element for rotation :  ");
        int n = UserIO.readInteger();

        // Display original array
        System.out.println("Original Array : ");
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " ");
        }

        // Rotating the given array by n times toward left
        for (int i = 0; i < n; i++) {

            int j, temp;

            // Storing the first element of an array in temp variable
            temp = arr[0];

            for (j = 0; j < MAX - 1; j++) {
                // Shift element of array by one
                arr[j] = arr[j + 1];
            }

            // Adding first element of an array to the end of array
            arr[j] = temp;
        }
        System.out.println();

        // Array after left rotation
        System.out.println("Array after left rotation : ");
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
