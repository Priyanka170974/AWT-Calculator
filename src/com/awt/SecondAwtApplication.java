package com.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondAwtApplication implements ActionListener {

    Frame frame;
    TextField textField;
    Button button;


    SecondAwtApplication(){
        frame = new Frame();
        textField = new TextField();
        button = new Button("click here");

        textField.setBounds(50,50,100,30);
        button.setBounds(100,110,100,30);

        frame.add(textField);
        frame.add(button);
        button.addActionListener(this);
        frame.setLayout(null);
        frame.setSize(450 ,350);
        frame.setVisible(true);
        frame.setBackground(Color.darkGray);
        button.setBackground(Color.white);
        textField.setBackground(Color.pink);
    }

    static void main(String[] args) {
        new SecondAwtApplication();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        textField.setText("Button Clicked");
    }
}
