// Java program to print the duplicate elements of an array
package com.nirajThagunna;

import java.io.IOException;

public class DuplicateElements extends Array1D {

    public static void main(String[] args) throws IOException {

        // Size of an array
        System.out.print("How many elements do you want to store?  ");
        int MAX = UserIO.readInteger();

        int []arr = readArray(MAX);

        // Checking for the duplicate elements in an array
        System.out.println("Duplicate elements of an array are : ");
        for (int i = 0; i < MAX; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
