package com.property.manager.Views;

import com.property.manager.Manager.AdminManager;
import com.property.manager.Models.Admin;
import com.property.manager.Views.utils.ImagePanel;
import com.property.manager.test;

import javax.swing.*;
import java.util.List;

public class SplashScreen {
    private JPanel panel1;

    public static void main(String[] args){

        ImagePanel backgroundImage = new ImagePanel(new ImageIcon("res\\drawable\\splash_background.jpg").getImage());

        String p =  System.getProperty("user.dir");


        JFrame frame = new JFrame("Splash");
        frame.getContentPane().add(backgroundImage);
        //frame.setContentPane(new SplashScreen().panel1);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
