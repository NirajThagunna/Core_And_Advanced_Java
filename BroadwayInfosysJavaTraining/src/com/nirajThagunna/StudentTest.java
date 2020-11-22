package com.nirajThagunna;

public class StudentTest {
    public static void main(String[] args) {
        NewStudent newStudent1 = new NewStudent("Niraj Thagunna",6317080,
                "Engineering", 50, 60, 70, 80,90);
        newStudent1.calculate();
        System.out.println(newStudent1);
        NewStudent newStudent2 = new NewStudent("Love",6317062,"Doctor",
                50,40,45,60,70);
        newStudent2.calculate();
        System.out.println(newStudent2);
    }
}
