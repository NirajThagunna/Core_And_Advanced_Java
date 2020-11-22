package com.nirajThagunna;

import java.io.IOException;

public class FrequencyOfElements extends Array1D {

    public static void main(String[] args) throws IOException {

        // Size of an array
        System.out.print("How many elements do you want to store?  ");
        int MAX = UserIO.readInteger();

        // Store elements of an array
        int []arr = readArray(MAX);

        // Stores frequency of an elements
        int []fre = new int[arr.length];

        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;

                    // To avoid counting same element again
                    fre[j] = visited;
                }
            }
            if (fre[i] != visited) {
                fre[i] = count;
            }
        }

        // Displaying
        System.out.println("-------------------------------------------------");
        System.out.println("Element\t|\tFrequency");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < fre.length; i++) {
            if (fre[i] != visited) {
                System.out.println(arr[i] + "\t\t|\t\t" + fre[i]);
            }
        }

        System.out.println("-------------------------------------------------");
    }
}
