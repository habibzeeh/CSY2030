package com.property.manager.Manager;


import com.property.manager.Models.FileManager;
import com.property.manager.Models.Flat;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FlatManager {
    private List<Flat> flatList;
    private String fileName = "flat.dat";
    private FileManager fileManager;

    public FlatManager() {
        fileManager = new FileManager(fileName);
        flatList = (List<Flat>) fileManager.ReadFile();
        if (flatList == null)
            flatList = new ArrayList<>();
    }

    public void addFlat(Flat flat) {
        flatList.add(flat);
        fileManager.saveFile(flatList);
    }

    public void deleteFlat(String id) {
        int i = -1;
        for (Flat fl : flatList)
            if (Objects.equals(fl.getId(), id))
                i = flatList.indexOf(fl);
        if (i != -1)
            flatList.remove(i);
        fileManager.saveFile(flatList);

    }

    public void editHOuse(Flat flat) {
        int i = -1;
        for (Flat fl : flatList)
            if (Objects.equals(fl.getId(), flat.getId()))
                i = flatList.indexOf(fl);
        if (i != -1) {
            flatList.remove(i);
            flatList.add(i, flat);
        }

    }
}
