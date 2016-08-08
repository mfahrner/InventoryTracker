package com.theironyard.charlotte;

/**
 * Created by mfahrner on 8/8/16.
 */
public class Wine extends InventoryItem {
    public Wine(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.category = "Wine";
    }
}
