package com.cc.startfx.model;

public class Inventory {
    public Integer inventoryId;
    public String inventoryName;
    public Integer inventoryPts;

    public Inventory(int inventoryId, String inventoryName, int inventoryPts) {
        this.inventoryId = inventoryId;
        this.inventoryName = inventoryName;
        this.inventoryPts = inventoryPts;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getInventoryName() {
        return inventoryName;
    }

    public void setInventoryName(String inventoryName) {
        this.inventoryName = inventoryName;
    }

    public int getInventoryPts() {
        return inventoryPts;
    }

    public void setInventoryPts(int inventoryPts) {
        this.inventoryPts = inventoryPts;
    }
}
