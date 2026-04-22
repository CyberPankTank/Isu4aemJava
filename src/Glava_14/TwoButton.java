package Glava_14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButton {
    private JFrame frame;
    private JLabel label;

    public static void main(String[] args) {
        TwoButton gui = new TwoButton();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Изменить метку");
        labelButton.addActionListener(event -> label.setText("Ай!"));

        JButton colorButton = new JButton("Изменит круг");
        colorButton.addActionListener(event -> frame.repaint());

        label = new JLabel("Метка");
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(500, 400);
        frame.setVisible(true);
    }
/*
    class LabelListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            label.setText("Ай!");
        }
    }
    class ColorListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            frame.repaint();
        }
    } */
}