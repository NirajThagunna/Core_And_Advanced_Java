// Java program to print the sum of all the items of the array
package com.nirajThagunna;

import java.io.IOException;

public class SumOfAllElements extends Array1D {

    public static void main(String[] args) throws IOException {

        // Declare and initialize an array
        int []arr = readArray(enterSize());

        // Printing the sum of all the elements of an array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("The sum of all the elements of an array is : " + sum);
    }
}
