// Java program to print the elements of an array in reverse order
package com.nirajThagunna;

import java.io.IOException;

public class ReverseOrder extends Array1D {

    public static void main(String[] args) throws IOException {

        // Size of an array
        System.out.print("How many elements do you want to store?  ");
        int MAX = UserIO.readInteger();

        int []arr = readArray(MAX);

        // Original array
        System.out.println("Original array : ");
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " ");
        }

        // Reversing the elements of an array
        System.out.println("\nArray in reverse order : ");
        for (int i = MAX - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
