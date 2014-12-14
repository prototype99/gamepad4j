package org.gamepad4j.test;

import javax.swing.JFrame;

public class DemoTest extends JFrame {

    public DemoTest() {

        add(new Board());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setTitle("GamepadAPI DemoTest");
        setResizable(false);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        new DemoTest();
    }
}
