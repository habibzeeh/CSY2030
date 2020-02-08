package com.property.manager;


import com.property.manager.Data.Read;
import com.property.manager.Data.Serialize;

import javax.swing.*;


public class test {
    private JButton button1;
    private JPanel panel1;

    public static void main(String[] args){

        //System.out.print("test");
        //Serialize.serializeFile();
        Read.Read();

        JFrame frame = new JFrame("test");
        frame.setContentPane(new test().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
