package com.property.manager.Manager;

import com.property.manager.Models.Secretary;
import com.property.manager.Models.FileManager;

import java.util.ArrayList;
import java.util.List;

public class secretaryManager {


    private List<Secretary> secretaryList;
    private String filename = "secretary.dat";
    private FileManager fileManager;

    public secretaryManager() {
        fileManager = new FileManager(filename);
        secretaryList = (List<Secretary>) fileManager.ReadFile();
        if (secretaryList == null)
            secretaryList = new ArrayList<>();
    }

}
