package com.theironyard.charlotte;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<InventoryItem> inventory = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        OptionMenu menu = new OptionMenu();

        menu.menu();

    }

    public static InventoryItem createItem(String name, int quantity, String category) throws Exception {
        if (category.equalsIgnoreCase("accessories")) {
            return new Accessories(name, quantity);
        } else if (category.equalsIgnoreCase("beer")) {
            return new Beer(name, quantity);
        } else if (category.equalsIgnoreCase("wine")) {
            return new Wine(name, quantity);
        } else if (category.equalsIgnoreCase("spirit")) {
            return new Spirit(name, quantity);
        } else if (category.equalsIgnoreCase("truffle")) {
            return new Truffle(name, quantity);
        } else
            throw new Exception("Invalid category");
    }

}



