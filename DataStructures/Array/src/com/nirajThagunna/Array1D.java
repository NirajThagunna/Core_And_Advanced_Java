package com.nirajThagunna;

import java.io.IOException;

public class Array1D extends UserIO {

    public static int enterSize() throws IOException {
        System.out.print("How many elements do you want to store?  ");
        int MAX = UserIO.readInteger();
        return MAX;
    }

    // Reading an array elements by taking an input from the user
    public static int[] readArray(int MAX) throws IOException {
        // Declaring, initializing and instantiating an array
        int []numbers = new int[MAX];

        // Entering an elements of an array by using for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter any number : ");
            numbers[i] = readInteger();
        }
        return numbers;
    }
}
