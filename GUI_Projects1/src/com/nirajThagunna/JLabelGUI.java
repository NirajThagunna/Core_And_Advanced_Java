package com.nirajThagunna;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class JLabelGUI {
    public static void main(String[] args) {
        new Frame();
    }
}

class Frame extends JFrame {
    public Frame(){

        setSize(400, 350);
        setTitle("GUI Project");
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating a label
        JLabel label1, label2;
        label1 = new JLabel("First Name: ");
        label1.setBounds(40, 40, 100, 30);
        label2 = new JLabel("Last Name: ");
        label2.setBounds(40, 75, 100, 30);
        add(label1);
        add(label2);

        // Creating a text field
        JTextField field1, field2;
        field1 = new JTextField("Enter your first name");
        field1.setBounds(160,40,200,30);
        field2 = new JTextField("Enter your last name");
        field2.setBounds(160,75,200,30);
        add(field1);
        add(field2);

        // Creating a button
        JButton button = new JButton("Click");
        button.setBounds(100,120,100,30);
        add(button);
        setVisible(true);
    }
}