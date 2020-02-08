package com.property.manager.Data;

import com.property.manager.Models.Admin;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Read {
    public static void Read() {
        List<Admin> adminList  = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream("admin.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            adminList = (List<Admin>) in.readObject();
           System.out.print("ok");
        }
        catch (Exception e)
        {

        }
    }
}
