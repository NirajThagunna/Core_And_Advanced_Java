package com.nirajThagunna;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class GUITest{
    JFrame frame;
    JLabel lbl_1;
    JTextField txt_1;
    JButton btn_1;
    public GUITest(){
        frame = new JFrame();
        lbl_1 = new JLabel();
        txt_1 = new JTextField();
        btn_1 = new JButton();
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(400,150);
        frame.setResizable(true);
        frame.setTitle("Calculator");
        lbl_1.setText("First No.");
        txt_1.setColumns(25);
        btn_1.setText("Add");

        frame.add(lbl_1);
        frame.add(txt_1);
        frame.add(btn_1);
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        new GUITest();
    }
}
