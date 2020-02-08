package com.property.manager.Data;

import com.property.manager.Models.Admin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class Serialize {

    public static void serializeFile() {


        List<Admin> adminList = new ArrayList<>();
        adminList.add( new Admin("Halima","halima","123"));
        adminList.add(  new Admin("Abdul","abdul","123"));


        String adminFilePath = "admin.dat";

        File adminFile = new File(adminFilePath);

        if(!adminFile.exists())
        {
            try
            {
                FileOutputStream fileOut =  new FileOutputStream(adminFilePath, false);
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(adminList);
                out.close();
                fileOut.close();
                System.out.printf("File has been serialized");
            }
            catch (IOException i)
            {
                i.printStackTrace();
            }
        }

    }
}
