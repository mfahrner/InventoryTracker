package com.theironyard.charlotte;

/**
 * Created by mfahrner on 8/8/16.
 */
public class InventoryItem {
    String name;
    int quantity;
    String category;

    public InventoryItem(String name, int quantity) {
        name = name;
        quantity = quantity;

    }

    public static InventoryItem createItem(String name, int quantity, String category) throws Exception {
        if (category.equals("accessories")) {
            return new Accessories(name, quantity);
        } else if (category.equals("beer")) {
            return new Beer(name, quantity);
        } else if (category.equals("wine")) {
            return new Wine(name, quantity);
        } else if (category.equals("spirit")) {
            return new Spirit(name, quantity);
        } else if (category.equals("truffle")) {
            return new Truffle(name, quantity);
        } else
            throw new Exception("Invalid category");
    }

    @Override
    public String toString() {
        return "[" + this.quantity + "]" + this.name + this.category;
    }

}






