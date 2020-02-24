package com.property.manager.Manager;

import com.property.manager.Models.Admin;
import com.property.manager.Models.FileManager;

import java.util.ArrayList;
import java.util.List;

public class AdminManager {

    private List<Admin> adminList;
    private String fileName = "admin.dat";
    private FileManager fileManager;

    public AdminManager() {
        fileManager = new FileManager(fileName);
        adminList = (List<Admin>)fileManager.ReadFile();
        if(adminList == null)
            adminList = new ArrayList<>();
    }

    public void addAdmin(Admin admin){
        adminList.add(admin);
        fileManager.saveFile(adminList);
    }

    public List<Admin> getAdminList() {
        return adminList;
    }

    public void deleteAdmin(String username){
        int i = -1;
        for (Admin ad:adminList)
            if(ad.getUsername().equals(username))
                i = adminList.indexOf(ad);
        if(i!=-1)
            adminList.remove(i);
        fileManager.saveFile(adminList);
    }

}