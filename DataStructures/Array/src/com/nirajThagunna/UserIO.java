package com.nirajThagunna;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class UserIO {

    public static String inputReader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String temp = reader.readLine();
        return temp;
    }

    // Reading an integer number
    public static int readInteger() throws IOException {
        int num = Integer.parseInt(inputReader());
        return num;
    }
}
