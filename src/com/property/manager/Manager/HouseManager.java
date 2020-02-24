package com.property.manager.Manager;

import com.property.manager.Models.FileManager;
import com.property.manager.Models.House;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HouseManager {
    private List<House> houseList;
    private String fileName = "house.dat";
    private FileManager fileManager;

    public HouseManager() {
        fileManager = new FileManager(fileName);
        houseList = (List<House>) fileManager.ReadFile();
        if (houseList == null)
            houseList = new ArrayList<>();
    }

    public void addhouse(House house) {
        houseList.add(house);
        fileManager.saveFile(houseList);
    }

    public void deleteHouse (String id) {
        int i = -1;
        for (House ho: houseList)
            if (Objects.equals(ho.getId(), id))
                i = houseList.indexOf(ho);
        if (i != -1)
            houseList.remove(i);
        fileManager.saveFile(houseList);

    }

    public void editHouse (House house) {
        int i = -1;
        for (House ho: houseList)
            if (Objects.equals(ho.getId(), house.getId()))
                i = houseList.indexOf(ho);
        if (i != -1) {
            houseList.remove(i);
            houseList.add(i, house);
        }

    }
}
