package com.theironyard.charlotte;

/**
 * Created by mfahrner on 8/8/16.
 */
public class Spirit extends InventoryItem {
    public Spirit(String name, int quantity) {
        super (name, quantity);
        this.category = "spirit";
    }
}