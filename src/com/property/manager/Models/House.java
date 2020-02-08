package com.property.manager.Models;

import java.io.Serializable;

public class House extends Property implements Serializable {

    private int numberOfFloors;
    private boolean gardent;

    public House(int id, String name, String status, long sellingPrice, long soldPrice, int noOfRooms, int numberOfFloors, boolean gardent) {
        super(id, name, status, sellingPrice, soldPrice, noOfRooms);
        this.numberOfFloors = numberOfFloors;
        this.gardent = gardent;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public boolean isGardent() {
        return gardent;
    }

    public void setGardent(boolean gardent) {
        this.gardent = gardent;
    }
}
