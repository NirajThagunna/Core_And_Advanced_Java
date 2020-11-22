package com.nirajThagunna;

import java.io.IOException;

public class ThreeDArray {
    public static void main(String[] args) throws IOException {
        int arrayIndex = 3;
        int ROWS = 3;
        int COLS = 3;

        int numbers[][][] = new int[arrayIndex][ROWS][COLS];

        for (int i = 0; i < arrayIndex; i++) {
            for (int j = 0; j < ROWS; j++) {
                for (int k = 0; k < COLS; k++) {
                    System.out.print("Enter the value of arrayIndex" +
                            " = " +i+" ,row = " +j+" and col = "+k);
                    numbers[i][j][k] = BasicIO.readInteger();
                }
            }
        }

        for (int i = 0; i < arrayIndex; i++) {
            for (int j = 0; j < ROWS; j++) {
                for (int k = 0; k < COLS; k++) {
                    System.out.println("numbers[" + i + "][" + j + "][" + k + "] = "
                            + numbers[i][j][k]);
                }
            }
        }
    }
}
