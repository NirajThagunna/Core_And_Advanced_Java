// Java program to illustrate creating an array of objects
package com.nirajThagunna;

class Student {
    public String name;
    public int roll_no;

    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }
}

// Elements of the array are objects of a class Student
public class ArrayObjects {

    public static void main(String[] args) {
        // Declaring an array of objects type
        Student[] arr;

        // allocating memory for objects of type Student
        arr = new Student[2];

        arr[0] = new Student("Niraj Thagunna", 6317080);
        arr[1] = new Student("Love", 6317070);

        // Accessing the objects of an array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at " + i + " : " +
                    arr[i].name + " " + arr[i].roll_no);
        }
    }
}
