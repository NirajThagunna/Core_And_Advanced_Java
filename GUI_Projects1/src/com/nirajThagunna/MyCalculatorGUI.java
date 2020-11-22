package com.nirajThagunna;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.JButton;

public class MyCalculatorGUI extends JFrame {
    JFrame frame;
    JTextField field;
    JPanel panel;
    JButton btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_10,
    btn_11, btn_12, btn_13, btn_14, btn_15, btn_16, btn_17, btn_18;

    public MyCalculatorGUI(){
        frame = new JFrame();
        field = new JTextField();
        panel = new JPanel();

        field.setBounds(50,25,250,40);
        field.setEditable(false);
        field.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createRaisedBevelBorder(),
                BorderFactory.createLoweredBevelBorder()));

        // Panel
        panel.setBounds(50,65,250,200);
        panel.setBackground(Color.GRAY);
        btn_1 = new JButton("C");
        btn_2 = new JButton("⌫");
        btn_3 = new JButton("7");
        btn_4 = new JButton("8");
        btn_5 = new JButton("9");
        btn_6 = new JButton("4");
        btn_7 = new JButton("5");
        btn_8 = new JButton("6");
        btn_9 = new JButton("1");
        btn_10 = new JButton("2");

        frame.add(field);
        frame.add(panel);

        frame.setSize(360,400);
        frame.setTitle("Simple Calculator");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        new MyCalculatorGUI();
    }
}
