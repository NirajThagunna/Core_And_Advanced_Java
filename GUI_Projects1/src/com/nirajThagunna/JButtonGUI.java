package com.nirajThagunna;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class JButtonGUI {
    public static void main(String[] args) {
        new Button();
    }
}

class Button extends JFrame {

    public Button(){
        setVisible(true);
        setSize(300, 350);
        // setting the title of the frame
        setTitle("Button");
        // If we call the setLayout(null), then we can position our components absolutely.
        setLayout(null);

        // Make the cross sign to close the frame
        // i.e. it will stop the execution.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating a button
        JButton btn = new JButton("Click");
        // Making the size and position of the button with
        // x = x-axis, y = y-axis, width, height
        btn.setBounds(100, 100, 95, 30);
        // Adding the button into the frame
        add(btn);
    }
}