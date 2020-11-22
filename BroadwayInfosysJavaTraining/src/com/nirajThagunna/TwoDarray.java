package com.nirajThagunna;

import java.io.IOException;

public class TwoDarray {
    public static void main(String[] args) throws IOException {
        int ROWS = 2;
        int COLS = 5;

        int numbers[][] = new int[ROWS][COLS];

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print("Enter");
                numbers[i][j] = BasicIO.readInteger();
            }
        }

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
