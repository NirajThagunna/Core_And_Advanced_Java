package com.nirajThagunna;

public class Student {
    private String name;
    private int roll_no;
    private String stream;

    public Student(String name, int roll_no, String stream) {
        this.name = name;
        this.roll_no = roll_no;
        this.stream = stream;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public String getStream() {
        return stream;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }
}
