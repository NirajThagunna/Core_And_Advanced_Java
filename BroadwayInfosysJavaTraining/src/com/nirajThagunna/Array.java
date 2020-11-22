package com.nirajThagunna;

import java.io.IOException;

public class Array {

    // Reading an array
    public static int[] readArray(int MAX) throws IOException {
        int []numbers = new int[MAX];
        for (int i = 0; i < MAX; i++) {
            System.out.print("Enter any number at index " + i + " : ");
            numbers[i] = BasicIO.readInteger();
        }
        return numbers;
    }

    // Accessing an elements from an array
    public static void printArray(int []array) {
        System.out.println("Elements of an array are : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // Finding the sum of elements of an array
    public static int doSum(int []array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    // Finding the minimum value of an array
    public static int minValue(int []array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min ) {
                min = array[i];
            }
        }
        return min;
    }

    // Finding the maximum value of an array
    public static int maxValue(int []array) {
        int max = Integer.MIN_VALUE;
        // OR int max = array[0]
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
