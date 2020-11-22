// Java program to print the largest element in an array
package com.nirajThagunna;

import java.io.IOException;

public class LargestElement extends Array1D {

    public static void main(String[] args) throws IOException {

        // Size of array
        System.out.print("How many elements do you want to store?  ");
        int MAX = UserIO.readInteger();

        // Declare and initialize an array
        int []arr = readArray(MAX);

        // Original array
        System.out.println("\nOriginal array : ");
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Finding the largest element of an array
        // initialize max with first element of array
        int max = arr[0];

        // Loop through array
        for (int i = 1; i < MAX; i++) {

            // Compare elements of array with max
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("\nThe largest element of array is : " + max);
    }
}
