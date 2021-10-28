package com.company;

import java.awt.*;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.Border;

public class Main {

    public static void main(String[] args) throws IOException {

        Web btcLabel = new Web();
        Web btcLabelGBP = new Web();

        // First Label - Title
        JLabel label = new JLabel();
        label.setText("Bitcoin Price Bot");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setForeground(new Color(212, 144, 57));
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Bahnschrift Condensed", Font.PLAIN, 65));
        label.setBounds(0, 35, 550, 100);

        // Second Label - USD
        JLabel label2 = new JLabel();
        label2.setText(btcLabel.btcpriceUSD());
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setVerticalTextPosition(JLabel.CENTER);
        label2.setVerticalAlignment(JLabel.TOP);
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setFont(new Font("Bahnschrift Condensed", Font.PLAIN, 35));
        label2.setBounds(275, 170, 200, 50);
        label2.setForeground(new Color(255, 255, 255));

        // Third Label - USD Tag
        JLabel label3 = new JLabel();
        label3.setText("USD Value: ");
        label3.setHorizontalTextPosition(JLabel.CENTER);
        label3.setVerticalTextPosition(JLabel.CENTER);
        label3.setVerticalAlignment(JLabel.TOP);
        label3.setHorizontalAlignment(JLabel.CENTER);
        label3.setFont(new Font("Bahnschrift Condensed", Font.PLAIN, 35));
        label3.setBounds(50, 170, 200, 50);
        label3.setForeground(new Color(255, 255, 255));

        // Fourth Label - GBP Tag
        JLabel label4 = new JLabel();
        label4.setText("GBP Value: ");
        label4.setHorizontalTextPosition(JLabel.CENTER);
        label4.setVerticalTextPosition(JLabel.CENTER);
        label4.setVerticalAlignment(JLabel.TOP);
        label4.setHorizontalAlignment(JLabel.CENTER);
        label4.setFont(new Font("Bahnschrift Condensed", Font.PLAIN, 35));
        label4.setBounds(50, 250, 200, 50);
        label4.setForeground(new Color(255, 255, 255));

        // Fourth Label - GBP Value
        JLabel label5 = new JLabel();
        label5.setText(btcLabelGBP.btcpriceGBP());
        label5.setHorizontalTextPosition(JLabel.CENTER);
        label5.setVerticalTextPosition(JLabel.CENTER);
        label5.setVerticalAlignment(JLabel.TOP);
        label5.setHorizontalAlignment(JLabel.CENTER);
        label5.setFont(new Font("Bahnschrift Condensed", Font.PLAIN, 35));
        label5.setBounds(275, 250, 200, 50);
        label5.setForeground(new Color(255, 255, 255));

        // Main Frame called frame
        JFrame frame = new JFrame(); // Creates main frame
        frame.setTitle("Bitcoin Price Bot");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(550, 450);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);

        // Background color
        frame.getContentPane().setBackground(Color.DARK_GRAY);

        // Logo
        ImageIcon image = new ImageIcon("bitcoinlogo.jpg");
        frame.setIconImage(image.getImage());
    }
}
