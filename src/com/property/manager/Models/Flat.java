package com.property.manager.Models;

import java.io.Serializable;

public class Flat extends Property implements Serializable {


    private int FloorItsOn;
    private double monthlyCharge;


    public Flat(int id, String name, String status, long sellingPrice, long soldPrice, int noOfRooms, int floorItsOn, double monthlyCharge) {
        super(id, name, status, sellingPrice, soldPrice, noOfRooms);
        FloorItsOn = floorItsOn;
        this.monthlyCharge = monthlyCharge;
    }

    public int getFloorItsOn() {
        return FloorItsOn;
    }

    public void setFloorItsOn(int floorItsOn) {
        FloorItsOn = floorItsOn;
    }

    public double getMonthlyCharge() {
        return monthlyCharge;
    }

    public void setMonthlyCharge(double monthlyCharge) {
        this.monthlyCharge = monthlyCharge;
    }
}

