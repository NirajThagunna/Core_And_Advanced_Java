package com.nirajThagunna;

public class Class3 extends Class2 {
    public Class3(int a, int b, int x, int y) {
        super(a, b, x, y);
    }

    public static void main(String[] args) {
        Class3 class3 = new Class3(50, 40, 30, 20);
        System.out.println(class3.a);
        System.out.println(class3.b);
        System.out.println(class3.x);
        System.out.println(class3.y);
        class3.setC(100);
        System.out.println(class3.getC());
        class3.setZ(200);
        System.out.println(class3.getZ());
    }
}
