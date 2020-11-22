package com.nirajThagunna;

import java.io.IOException;

public class CopyElements extends Array1D {

    public static void main(String[] args) throws IOException {
        // Size of an array
        System.out.print("How many elements do you want to store?  ");
        int MAX = UserIO.readInteger();

        // First Array
        int []arr1 = readArray(MAX);

        // Second Array
        int []arr2 = new int[arr1.length];

        // Copying an elements of arr1 to arr2
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        // Displaying an elements of arr1
        System.out.println("Elements of arr1 : ");
        for (int i : arr1) {
            System.out.print(i + " ");
        }

        // Displaying an elements of arr2
        System.out.println("\nElements of arr2 : ");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}
