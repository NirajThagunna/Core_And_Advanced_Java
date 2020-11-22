package com.nirajThagunna;

public class FunctionOverloading {
    public static void f1() {
        System.out.println("Hello");
    }
    public static String f1(String msg) {
        return msg;
    }
    public static void f1(String label, String msg) {
        System.out.println(label + " " +msg);
    }
    public static int f1(int n1, int n2) {
        return (n1 + n2);
    }

    public static void main(String[] args) {
        FunctionOverloading.f1();
        System.out.println(FunctionOverloading.f1("Well Done !"));
        FunctionOverloading.f1("Full Name : ", "Niraj Thagunna");
        System.out.println(FunctionOverloading.f1(5, 10));
    }
}
