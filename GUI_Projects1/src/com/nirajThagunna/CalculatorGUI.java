package com.nirajThagunna;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class CalculatorGUI implements ActionListener {

    JFrame frame;
    JLabel label_1, label_2, head_label;
    JTextField field_1, field_2, field_3;
    JButton btn_add, btn_sub, btn_mul, btn_div, close_btn;

    public CalculatorGUI(){
        frame = new JFrame();

        frame.setTitle("Simple Calculator");
        frame.setSize(312, 350);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        head_label = new JLabel("Simple Calculator");
        head_label.setBounds(62,0,200,40);
        head_label.setFont(new Font("Serif", Font.BOLD, 21));
        head_label.setForeground(new Color(250,0,0));
        label_1 = new JLabel("Enter first number : ");
        label_1.setBounds(20,45,120,40);
        field_1 = new JTextField();
        field_1.setBounds(170,55,100,20);
        label_2 = new JLabel("Enter second number : ");
        label_2.setBounds(20, 85, 150, 40);
        field_2 = new JTextField();
        field_2.setBounds(170,95,100,20);

        btn_add = new JButton("+");
        btn_add.setBounds(20,143,50,40);
        btn_sub = new JButton("-");
        btn_sub.setBounds(87,143,50,40);
        btn_mul = new JButton("*");
        btn_mul.setBounds(153,143,50,40);
        btn_div = new JButton("/");
        btn_div.setBounds(220,143,50,40);

        field_3 = new JTextField();
        field_3.setBounds(20,215,250,30);
        field_3.setBorder(new LineBorder(Color.BLUE, 2));
        field_3.setEditable(false);

        close_btn = new JButton("Close");
        close_btn.setBounds(85,270,120,30);

        // addActionListener is used to add the specified action listener to receive
        // action events from this text field.
        btn_add.addActionListener(this);
        btn_sub.addActionListener(this);
        btn_mul.addActionListener(this);
        btn_div.addActionListener(this);
        close_btn.addActionListener(this);

        frame.add(head_label);
        frame.add(label_1);
        frame.add(field_1);
        frame.add(label_2);
        frame.add(field_2);

        frame.add(btn_add);
        frame.add(btn_sub);
        frame.add(btn_mul);
        frame.add(btn_div);

        frame.add(field_3);

        frame.add(close_btn);

        frame.setVisible(true);
    }

    // Action Performed
    public void actionPerformed(ActionEvent event) {

        // Addition
        if (event.getSource() == btn_add) {
            int n1, n2, n3;
            n1 = Integer.parseInt(field_1.getText());
            n2 = Integer.parseInt(field_2.getText());
            Calculator calculator = new Calculator(n1, n2);
            calculator.doSum();
            n3 = (int) calculator.getNum3();
            field_3.setText(Integer.toString(n3));
        }

//        if (event.getSource() == btn_add) {
//            double n1, n2, n3;
//            n1 = Double.parseDouble(field_1.getText());
//            n2 = Double.parseDouble(field_2.getText());
//            Calculator calculator = new Calculator(n1, n2);
//            calculator.doSum();
//            n3 = calculator.getNum3();
//            field_3.setText(Double.toString(n3));
//        }

        // Subtraction
        else if (event.getSource() == btn_sub) {
            int n1, n2, n3;
            n1 = Integer.parseInt(field_1.getText());
            n2 = Integer.parseInt(field_2.getText());
            Calculator calculator = new Calculator(n1, n2);
            calculator.doSubtraction();
            n3 = (int) calculator.getNum3();
            field_3.setText(Integer.toString(n3));
        }

        // Multiplication
        else if (event.getSource() == btn_mul) {
            int n1, n2, n3;
            n1 = Integer.parseInt(field_1.getText());
            n2 = Integer.parseInt(field_2.getText());
            Calculator calculator = new Calculator(n1, n2);
            calculator.doMultiply();
            n3 = (int) calculator.getNum3();
            field_3.setText(Integer.toString(n3));
        }

        // Division
        else if (event.getSource() == btn_div) {
            int n1, n2;
            n1 = Integer.parseInt(field_1.getText());
            n2 = Integer.parseInt(field_2.getText());
            Calculator calculator = new Calculator(n1, n2);
            calculator.doDivision();
            field_3.setText(Double.toString(calculator.getNum3()));
        }

        // Close operation
        else if (event.getSource() == close_btn) {
            System.exit(0);
        }

        else{
            field_3.setText("Invalid");
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}