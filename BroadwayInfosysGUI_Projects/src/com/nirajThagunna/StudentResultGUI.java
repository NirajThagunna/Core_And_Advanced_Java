package com.nirajThagunna;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class StudentResultGUI extends JFrame implements ActionListener {

    private Container container;
    private JLabel title, fullName, rollNo, collegeName, stream, marks1, marks2,
    marks3, marks4, marks5, resetOut;
    private JTextField field_1, field_2, field_3, field_4, field_5, field_6, field_7,
    field_8, field_9;
    private JButton submit, reset;
    private JTextArea output, resetArea;

    public StudentResultGUI() {

        setTitle("Student Result");
        setBounds(250,100,950,600);
        setBackground(Color.GRAY);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        container = getContentPane();
        container.setLayout(null);

        title = new JLabel("Student Result Marks Sheet");
        title.setFont(new Font("Arial",Font.PLAIN,30));
        title.setSize(425,30);
        title.setLocation(250,16);
        container.add(title);

        fullName = new JLabel("Name : ");
        fullName.setFont(new Font("Arial",Font.PLAIN,20));
        fullName.setSize(250,20);
        fullName.setLocation(70,70);
        container.add(fullName);

        field_1 = new JTextField();
        field_1.setFont(new Font("Arial",Font.PLAIN,15));
        field_1.setSize(190, 25);
        field_1.setLocation(230, 70);
        field_1.addActionListener(this);
        container.add(field_1);

        rollNo = new JLabel("Roll Number :");
        rollNo.setFont(new Font("Arial",Font.PLAIN,20));
        rollNo.setSize(250,20);
        rollNo.setLocation(70,110);
        container.add(rollNo);

        field_2 = new JTextField();
        field_2.setFont(new Font("Arial",Font.PLAIN,15));
        field_2.setSize(190,25);
        field_2.setLocation(230,110);
        field_2.addActionListener(this);
        container.add(field_2);

        collegeName = new JLabel("College Name :");
        collegeName.setFont(new Font("Arial",Font.PLAIN,20));
        collegeName.setSize(250,20);
        collegeName.setLocation(70,150);
        container.add(collegeName);

        field_3 = new JTextField();
        field_3.setFont(new Font("Arial",Font.PLAIN,15));
        field_3.setSize(190,25);
        field_3.setLocation(230,150);
        container.add(field_3);

        stream = new JLabel("Stream : ");
        stream.setFont(new Font("Arial",Font.PLAIN,20));
        stream.setSize(250,20);
        stream.setLocation(70,190);
        container.add(stream);

        field_4 = new JTextField();
        field_4.setFont(new Font("Arial",Font.PLAIN,15));
        field_4.setSize(190,25);
        field_4.setLocation(230,190);
        container.add(field_4);

        marks1 = new JLabel("Marks in DBMS :");
        marks1.setFont(new Font("Arial",Font.PLAIN,20));
        marks1.setSize(250,20);
        marks1.setLocation(70,230);
        container.add(marks1);

        field_5 = new JTextField();
        field_5.setFont(new Font("Arial",Font.PLAIN,15));
        field_5.setSize(190,25);
        field_5.setLocation(230,230);
        container.add(field_5);

        marks2 = new JLabel("Marks in OOP :");
        marks2.setFont(new Font("Arial",Font.PLAIN,20));
        marks2.setSize(250,20);
        marks2.setLocation(70,270);
        container.add(marks2);

        field_6 = new JTextField();
        field_6.setFont(new Font("Arial",Font.PLAIN,15));
        field_6.setSize(190,25);
        field_6.setLocation(230,270);
        container.add(field_6);

        marks3 = new JLabel("Marks in DS :");
        marks3.setFont(new Font("Arial",Font.PLAIN,20));
        marks3.setSize(250,20);
        marks3.setLocation(70,310);
        container.add(marks3);

        field_7 = new JTextField();
        field_7.setFont(new Font("Arial",Font.PLAIN,15));
        field_7.setSize(190,25);
        field_7.setLocation(230,310);
        container.add(field_7);

        marks4 = new JLabel("Marks in FOCP :");
        marks4.setFont(new Font("Arial",Font.PLAIN,20));
        marks4.setSize(250,20);
        marks4.setLocation(70,350);
        container.add(marks4);

        field_8 = new JTextField();
        field_8.setFont(new Font("Arial",Font.PLAIN,15));
        field_8.setSize(190,25);
        field_8.setLocation(230,350);
        container.add(field_8);

        marks5 = new JLabel("Marks in SDLC :");
        marks5.setFont(new Font("Arial",Font.PLAIN,20));
        marks5.setSize(250,20);
        marks5.setLocation(70,390);
        container.add(marks5);

        field_9 = new JTextField();
        field_9.setFont(new Font("Arial",Font.PLAIN,15));
        field_9.setSize(190,25);
        field_9.setLocation(230,390);
        container.add(field_9);

        submit = new JButton("Submit");
        submit.setFont(new Font("Arial",Font.PLAIN,18));
        submit.setSize(100,35);
        submit.setLocation(125,440);
        submit.addActionListener(this);
        container.add(submit);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial",Font.PLAIN,18));
        reset.setSize(100,35);
        reset.setLocation(255,440);
        reset.addActionListener(this);
        container.add(reset);

        output = new JTextArea();
        output.setFont(new Font("Arial",Font.PLAIN,18));
        output.setSize(350,420);
        output.setLocation(500,70);
        output.setLineWrap(true);
        output.setEditable(false);
        container.add(output);

        resetOut = new JLabel(" ");
        resetOut.setFont(new Font("Arial",Font.PLAIN,30));
        resetOut.setSize(500,25);
        resetOut.setLocation(215,505);
        container.add(resetOut);

        setVisible(true);
    }

    // Function to perform action according to user's
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == submit) {
            String data1 = "Name : " + field_1.getText();
            int roll_no = Integer.parseInt(field_2.getText());
            String data2 = "\nRoll Number : " + roll_no;
            String data3 = "\nCollege Name : " + field_3.getText() + "\n"
                    + "Stream : " + field_4.getText();
            int m1, m2, m3, m4, m5;
            m1 = Integer.parseInt(field_5.getText());
            m2 = Integer.parseInt(field_6.getText());
            m3 = Integer.parseInt(field_7.getText());
            m4 = Integer.parseInt(field_8.getText());
            m5 = Integer.parseInt(field_9.getText());
            String data4 = "\nMarks obtained in DBMS : " + m1 + "\n"
                    + "Marks obtained in OPP : " + m2 + "\n"
                    + "Marks obtained in DS : " + m3 + "\n"
                    + "Marks obtained in FOCP : " + m4 + "\n"
                    + "Marks obtained in SDLC : " + m5;
            StudentResult studentResult = new StudentResult(field_3.getText());
            studentResult.setMarks1(m1);
            studentResult.setMarks2(m2);
            studentResult.setMarks3(m3);
            studentResult.setMarks4(m4);
            studentResult.setMarks5(m5);

            studentResult.doSum();
            int total = (int) studentResult.getTotal();
            String data5 = "\nTotal marks obtained is : " + total;

            studentResult.doAverage();
            String data6 = "\nAverage marks obtained is : " + studentResult.getAverage();

            studentResult.findingResult();
            String data7;
            if (studentResult.getResult().equals("PASS")) {
                data7 = "\nCongratulations, You Are PASSED !";
            }
            else {
                data7 = "\nSorry, Work Hard and Try For Next Time !";
            }

            studentResult.findingGrade();
            String data8 = "\nGrade : " + studentResult.getGrade();

            studentResult.findingPercentage();
            String data9 = "\nPercentage : " + studentResult.getPercentage() +"%";

            // Output
            output.setText(data1 + data2 + data3 + data4 + data5 + data6 +
                    data7 + data8 + data9);
            resetOut.setText(studentResult.getResult());
        }
        else if (event.getSource() == reset) {
            String def = " ";
            field_1.setText(def);
            field_2.setText(def);
            field_3.setText(def);
            field_4.setText(def);
            field_5.setText(def);
            field_6.setText(def);
            field_7.setText(def);
            field_8.setText(def);
            field_9.setText(def);
            output.setText(def);
            resetOut.setText(def);
        }
    }

    public static void main(String[] args) {
        new StudentResultGUI();
    }
}
