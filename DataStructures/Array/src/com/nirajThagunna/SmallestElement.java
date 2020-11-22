// Java program to print the smallest element in an array
package com.nirajThagunna;

import java.io.IOException;

public class SmallestElement extends Array1D {

    public static void main(String[] args) throws IOException {

        // Size of array
        System.out.print("How many elements do you want to store?  ");
        int MAX = UserIO.readInteger();

        // Declare and initialize an array
        int []arr = readArray(MAX);

        // Original Array
        System.out.println("Original array : ");
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Finding the smallest element present in an array
        // Store the first element of an array in the min variable
        // Initialize min with first element of array
        int min = arr[0];

        // Iterate through the loop
        for (int i = 1; i < MAX; i++) {

            // Compare the elements of an array with min value
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The smallest element in a given array is : " + min);
    }
}
