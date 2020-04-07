package com.property.manager.Manager;

import com.property.manager.Models.Admin;
import com.property.manager.Models.FileManager;

public class LoginManager {

    AdminManager adminManager;

    public LoginManager() {
        adminManager = new AdminManager();

    }

    public boolean checkLogin(String username ,String password){

        if(username.equals("admin")) {
            Admin admin = adminManager.getAdmin();
            if (admin.getPassword().equals(password))

                return true;
        }


        return false;

    }
}
