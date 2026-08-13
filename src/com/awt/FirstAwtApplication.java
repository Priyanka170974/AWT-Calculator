package com.awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FirstAwtApplication {
    static void main(String[] args) {
        Frame frame = new Frame("Priyanka Jain");
        frame.setSize(400,300);
frame.setVisible(true);
frame.addWindowListener(new WindowAdapter() {
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
});
    }
}
