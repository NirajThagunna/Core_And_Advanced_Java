package com.nirajThagunna;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BasicIO {

    // Taking an input form the user by using user defined function
    public static String dataInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String temp = reader.readLine();
        return temp;
    }

    // Integer Numbers
    public static int readInteger() throws IOException {
        int num = Integer.parseInt(dataInput());
        return num;
    }

    // Double Numbers
    public static double readDouble() throws IOException {
        double num = Double.parseDouble(dataInput());
        return num;
    }
}