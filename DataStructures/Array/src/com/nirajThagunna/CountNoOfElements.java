// Java program to print the number of elements present in an array
package com.nirajThagunna;

import java.io.IOException;

public class CountNoOfElements extends Array1D {

    public static void main(String[] args) throws IOException {

        // Size of array
        System.out.print("How many elements do you want to store?  ");
        int MAX = UserIO.readInteger();

        int []arr = readArray(MAX);

        // Original Array
        System.out.println("Original array : ");
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Counting the number of elements present in a given array
        int count = 0;
        for (int i = 0; i < MAX; i++) {
            count++;
        }
        System.out.println("Total number of elements present in a given array : " + count);
    }
}
