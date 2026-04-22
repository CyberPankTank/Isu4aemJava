package Glava_14;

import javax.swing.*;

public class SimpleGui1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("ֽאזלט לוםÿ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
