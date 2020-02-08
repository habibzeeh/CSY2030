package com.property.manager.Models;

import java.io.Serializable;

public class Property implements Serializable {

    private int id;
    private String name;
    private String status;
    private long sellingPrice;
    private long soldPrice;
    private int noOfRooms;

    public Property(int id, String name, String status, long sellingPrice, long soldPrice, int noOfRooms) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.sellingPrice = sellingPrice;
        this.soldPrice = soldPrice;
        this.noOfRooms = noOfRooms;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(long sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public long getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(long soldPrice) {
        this.soldPrice = soldPrice;
    }

    public int getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
    }
}
