package com.property.manager;


import com.property.manager.Manager.AdminManager;
import com.property.manager.Models.Admin;

import javax.swing.*;
import java.util.List;


public class test {
    private JButton button1;
    private JPanel panel1;

    public static void main(String[] args){

        AdminManager adminManager = new AdminManager();
        /*Admin admin1 = new Admin("Abdul","abdul","123");
        adminManager.addAdmin(admin1);
        Admin admin2 = new Admin("Huma","huma","123");
        adminManager.addAdmin(admin2);*/
        List<Admin> admins =  adminManager.getAdminList();

        JFrame frame = new JFrame("test");
        frame.setContentPane(new test().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
