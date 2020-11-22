package com.nirajThagunna;

public class Second {
    public static void main(String[] args) {
        StudentResult studentResult = new StudentResult("KUK");
        studentResult.setMarks1(10);
        studentResult.setMarks2(95);
        studentResult.setMarks3(20);
        studentResult.setMarks4(90);
        studentResult.setMarks5(90);

        studentResult.doSum();
        System.out.println("Total : "+studentResult.getTotal());

        studentResult.doAverage();
        System.out.println("Average : "+studentResult.getAverage());

        studentResult.findingPercentage();
        System.out.println("Per :"+studentResult.getPercentage());

        studentResult.findingGrade();
        System.out.println("Grade : "+studentResult.getGrade());

        studentResult.findingResult();
        String data;
        System.out.println("Result : "+studentResult.getResult());
        if ("PASS".equals(studentResult.getResult())) {
            data = "Congratulations !";
        }
        else {
            data = "Sorry, Work Hard !";
        }
        System.out.println(data);
    }
}