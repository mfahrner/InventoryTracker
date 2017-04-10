package com.theironyard.charlotte;

/**
 * Created by mfahrner on 8/8/16.
 */
public class Accessories extends InventoryItem {

    public Accessories(String name, int quantity) {
        super (name, quantity);
        this.category = "accessories";
        // do i need to set field category within each class?
    }

}
