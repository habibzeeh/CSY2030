package com.property.manager.Views;

import javax.swing.*;
import java.awt.*;

public class SplashScreen extends JFrame {

    private JPanel jPanel = new JPanel();
    private JButton adminButton = new JButton();
    private JButton staffButton = new JButton();


    public SplashScreen() throws HeadlessException {

        setTitle("Property Manager");
        setVisible(true);
        setSize(1024,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jPanel.setLayout(null);

        adminButton.setIcon(new ImageIcon("res//drawable//admin_icon.png"));
        adminButton.setBounds(100,100,128,128);
        staffButton.setIcon(new ImageIcon("res//drawable//admin_icon.png"));
        staffButton.setBounds(50,50,128,128);
        jPanel.add(adminButton);
        jPanel.add(staffButton);

        add(jPanel);
        validate();
    }

    public static void main(String[] args) {

        SplashScreen splashScreen = new SplashScreen();
    }

}
