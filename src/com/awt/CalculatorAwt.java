package com.awt;

import java.awt.*;
import java.awt.event.*;

public class CalculatorAwt implements ActionListener {

    Frame frame;
    Label title, l1, l2, l3;
    TextField t1, t2, t3;
    Button add, sub, multi, div, clear;

    CalculatorAwt() {

        // Frame
        frame = new Frame("✨ Creative AWT Calculator");

        // Title
        title = new Label("  CALCULATOR  ", Label.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 22));

        // Labels
        l1 = new Label("First Number");
        l2 = new Label("Second Number");
        l3 = new Label("Result");

        l1.setFont(new Font("Arial", Font.BOLD, 14));
        l2.setFont(new Font("Arial", Font.BOLD, 14));
        l3.setFont(new Font("Arial", Font.BOLD, 14));

        // TextFields
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();

        t1.setFont(new Font("Arial", Font.BOLD, 16));
        t2.setFont(new Font("Arial", Font.BOLD, 16));
        t3.setFont(new Font("Arial", Font.BOLD, 16));

        t3.setEditable(false);

        // Buttons
        add = new Button(" ADD");
        sub = new Button("  SUBTRACT");
        multi = new Button("  MULTIPLY");
        div = new Button(" DIVIDE");
        clear = new Button("CLEAR");

        // Button Font
        Font buttonFont = new Font("Arial", Font.BOLD, 13);

        add.setFont(buttonFont);
        sub.setFont(buttonFont);
        multi.setFont(buttonFont);
        div.setFont(buttonFont);
        clear.setFont(buttonFont);

        // Positions
        title.setBounds(40, 45, 320, 40);

        l1.setBounds(50, 100, 110, 30);
        t1.setBounds(180, 100, 150, 30);

        l2.setBounds(50, 145, 110, 30);
        t2.setBounds(180, 145, 150, 30);

        add.setBounds(45, 195, 100, 35);
        sub.setBounds(150, 195, 100, 35);
        multi.setBounds(255, 195, 100, 35);

        div.setBounds(100, 240, 100, 35);
        clear.setBounds(205, 240, 100, 35);

        l3.setBounds(50, 295, 110, 30);
        t3.setBounds(180, 295, 150, 30);

        // Add components
        frame.add(title);

        frame.add(l1);
        frame.add(t1);

        frame.add(l2);
        frame.add(t2);

        frame.add(add);
        frame.add(sub);
        frame.add(multi);
        frame.add(div);
        frame.add(clear);

        frame.add(l3);
        frame.add(t3);

        // Button Events
        add.addActionListener(this);
        sub.addActionListener(this);
        multi.addActionListener(this);
        div.addActionListener(this);
        clear.addActionListener(this);

        // Close Window
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Frame settings
        frame.setLayout(null);
        frame.setSize(400, 370);
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorAwt();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Clear button
        if (e.getSource() == clear) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            return;
        }

        try {

            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());

            if (e.getSource() == add) {
                t3.setText(String.valueOf(num1 + num2));
            }

            else if (e.getSource() == sub) {
                t3.setText(String.valueOf(num1 - num2));
            }

            else if (e.getSource() == multi) {
                t3.setText(String.valueOf(num1 * num2));
            }

            else if (e.getSource() == div) {

                if (num2 == 0) {
                    t3.setText("Cannot divide by 0");
                } else {
                    t3.setText(String.valueOf(num1 / num2));
                }
            }

        } catch (NumberFormatException ex) {
            t3.setText("Enter valid numbers!");
        }
    }
}