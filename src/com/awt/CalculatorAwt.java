package com.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CalculatorAwt implements ActionListener {
    Frame frame;
    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button add, sub, multi, div;

    CalculatorAwt() {
        frame = new Frame("Calculator");
        l1 = new Label("Enter first Number");
        l2 = new Label("Enter second Number");
        l3 = new Label("Final Result");

        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();

        add = new Button("Add");
        sub = new Button("sub");
        multi = new Button("multi");
        div = new Button("div");
        l1.setBounds(50, 50, 120, 30);
        t1.setBounds(180, 50, 120, 30);

        l2.setBounds(50, 100, 120, 30);
        t2.setBounds(180, 100, 120, 30);

        add.setBounds(70, 160, 80, 30);
        sub.setBounds(140, 160, 80, 30);
        multi.setBounds(210,160,80,30);
        div.setBounds(280,160,80,30);


        l3.setBounds(50, 220, 120, 30);
        t3.setBounds(180, 220, 120, 30);

        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(add);
        frame.add(sub);
        frame.add(multi);
        frame.add(div);
        frame.add(l3);
        frame.add(t3);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        add.addActionListener(this);
        sub.addActionListener(this);
        multi.addActionListener(this);
        div.addActionListener(this);
        frame.setLayout(null);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }


    static void main(String[] args) {
        new CalculatorAwt();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        if (e.getSource() == add) {
            t3.setText(String.valueOf(num1 + num2));
        }
        if (e.getSource() == sub) {
            t3.setText(String.valueOf(num1 - num2));
        }
        if (e.getSource() == multi) {
            t3.setText(String.valueOf(num1 * num2));

        }
        if (e.getSource() == div) {
            t3.setText(String.valueOf(num1 / num2));
        }
    }
}