package com.nirajThagunna;

import javax.swing.JFrame;
import javax.swing.JButton;

public class GUIButton {
    // Creating a reference of JFrame class
    JFrame frame;

    // Creating a Constructor for the GUIButton class
    GUIButton(){
        // Creating an instance of JFrame class
        frame = new JFrame("GUI Project");
        // Making visible the frame
        frame.setVisible(true);
        // Setting the frame size
        frame.setSize(300, 400);
        frame.setLayout(null);

        // Creating a button
        // Creating an instance of JButton class
        JButton button = new JButton("Add");
        button.setBounds(100, 100, 95, 30);
        frame.add(button);
    }

    // Main method
    public static void main(String[] args) {
        new GUIButton();
    }
}
