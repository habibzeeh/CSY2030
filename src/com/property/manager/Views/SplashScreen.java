package com.property.manager.Views;

import com.property.manager.Manager.AdminManager;
import com.property.manager.Models.Admin;
import com.property.manager.test;

import javax.swing.*;
import java.util.List;

public class SplashScreen {
    private JButton loginButton;
    private JTextArea propertyManagerSoftwareTextArea;
    private JPanel panel1;

    public static void main(String[] args){
        JFrame frame = new JFrame("Splash");
        frame.setContentPane(new SplashScreen().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
