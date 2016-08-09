package com.theironyard.charlotte;

/**
 * Created by mfahrner on 8/8/16.
 */
public class Truffle extends InventoryItem {
    public Truffle(String name, int quantity) {
        super (name, quantity);
        this.category = "truffle";
    }
}
