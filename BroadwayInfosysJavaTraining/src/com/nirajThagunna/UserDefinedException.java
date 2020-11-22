package com.nirajThagunna;

import java.util.Scanner;

class MyException extends Exception {
    String message;

    public MyException(String message) {
        this.message = message;
    }

    public String toString() {
        return this.message;
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        int num;
        try {
            System.out.print("Enter any number between (1-10) : ");
            num = Integer.parseInt(new Scanner(System.in).nextLine());
            if (num < 1) {
                throw new MyException("Number is too low. Please enter the number between (1-10).");
            }
            else if (num > 10) {
                throw new MyException("Number is too high. Please enter the number between (1-10).");
            }
            else {
                System.out.println("Number is : " + num);
            }
        }
        catch (NumberFormatException ex) {
            System.out.println("Error1 : " + ex.getMessage());
        }
        catch (MyException ex) {
            System.out.println("Error2 : " + ex);
        }
    }
}
