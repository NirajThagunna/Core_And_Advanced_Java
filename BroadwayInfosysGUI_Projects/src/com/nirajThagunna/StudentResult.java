package com.nirajThagunna;

public class StudentResult {

    String fullName;
    int rollNo;
    String collegeName;
    String stream;
    int marks1;
    int marks2;
    int marks3;
    int marks4;
    int marks5;
    double total;
    double average;
    String result;
    String grade;
    double percentage;
    double PM = 40;

    // Creating a constructor

    public StudentResult(String collegeName) {
        fullName = null;
        rollNo = 0;
        this.collegeName = collegeName;
        stream = null;
        marks1 = 0;
        marks2 = 0;
        marks3 = 0;
        marks4 = 0;
        marks5 = 0;
        total = 0;
        average = 0;
        this.result = null;
        this.grade = null;
        percentage = 0;
    }

    // getter
    public double getTotal () {
        return total;
    }

    public double getAverage() {
        return average;
    }

    public String getResult() {
        return result;
    }

    public String getGrade() {
        return this.grade;
    }

    public double getPercentage() {
        return percentage;
    }

    // setter
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    public void setStream(String stream) {
        this.stream = stream;
    }
    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }
    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }
    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }
    public void setMarks4(int marks4) {
        this.marks4 = marks4;
    }
    public void setMarks5(int marks5) {
        this.marks5 = marks5;
    }

    // Process
    public void doSum() {
        total = marks1 + marks2 + marks3 + marks4 + marks5;
    }

    public void doAverage() {
        average = (double) total / 5;
    }

    public void findingPercentage() {
        this.percentage = (double) ( total / 500 ) * 100;
    }

    public void findingResult() {
        if ((this.marks1 >= PM) && (this.marks2>=PM) && (this.marks3>=PM) && (this.marks4>=PM)) {
            this.result = "PASS";
        }
        else {
            this.result = "FAIL";
        }
    }

    public void findingGrade() {
        this.grade = "FAIL";
        if (this.result.equals("PASS") && this.percentage >= 90) {
            this.grade = "A+";
        }
        else if ( this.result.equals("PASS") && this.percentage >= 80 && this.percentage < 90) {
            this.grade = "A";
        }
        else if (this.result.equals("PASS") && this.percentage >= 70 && this.percentage < 80) {
            this.grade = "B+";
        }
        else if (this.result.equals("PASS") && this.percentage >= 60 && this.percentage < 70) {
            this.grade = "B";
        }
        else if (this.result.equals("PASS") && this.percentage >= 50 && this.percentage < 60) {
            this.grade = "C";
        }
        else if (this.result.equals("PASS") && this.percentage >= 40 && this.percentage < 50) {
            this.grade = "D";
        }
    }
}
