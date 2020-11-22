//package com.nirajThagunna;
//
//// Taking an input from the console using user defined function i.e.
//// Using Buffered Reader Class
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class StudentResultConsole {
//    public static void main(String[] args) throws IOException {
//        //Enter input data using BufferReader
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        // Reading data using readLine()
//        String name = reader.readLine();
//        int roll = reader.read();
//        String college = reader.readLine();
//        String stream = reader.readLine();
//        int m1, m2, m3, m4, m5;
//        m1 = reader.read();
//        m2 = reader.read();
//        m3 = reader.read();
//        m4 = reader.read();
//        m5 = reader.read();
//
//        StudentResult studentResult = new StudentResult();
//        studentResult.setFullName(name);
//        studentResult.setRollNo(roll);
//        studentResult.setCollegeName(college);
//        studentResult.setStream(stream);
//        studentResult.setMarks1(m1);
//        studentResult.setMarks2(m2);
//        studentResult.setMarks3(m3);
//        studentResult.setMarks4(m4);
//        studentResult.setMarks5(m5);
//
//        System.out.println(studentResult.getFullName()+"\n"+studentResult.getRollNo()+
//                "\n"+studentResult.getCollegeName() + "\n" +studentResult.getStream()+
//                "\n"+studentResult.getMarks1() + "\n" +studentResult.getMarks2()+
//                "\n" +studentResult.getMarks3() + "\n" + studentResult.getMarks4() + "\n"+
//                studentResult.getMarks5() + "\n");
//
//        System.out.println("Total : "+studentResult.getTotal());
//        System.out.println("Average : "+studentResult.getAverage());
//        System.out.println("Percentage : "+studentResult.getPercentage());
//        System.out.println("Grade : "+studentResult.getGrade());
//        System.out.println("Result : "+studentResult.getResult());
//    }
//}
