package com.theironyard.charlotte;

import java.util.Scanner;

/**
 * Created by mfahrner on 4/10/17.
 */
public class OptionMenu {
    Scanner scannerInt = new Scanner(System.in);
    Scanner scannerStr = new Scanner(System.in);

    public void menu() throws Exception {
        while (true) {
            printItems();
            options();
        }

    }

    public void printItems() {
        for (InventoryItem item : Main.inventory) {
            System.out.printf("%s %s\n", Main.inventory.indexOf(item), item);
        }
    }

    public void options() throws Exception {
        System.out.println("1. Create new item");
        System.out.println("2. Remove an item");
        System.out.println("3. Update an item's quantity");

        int option = Integer.parseInt(scannerStr.nextLine());

        switch (option) {
            case 1:
                addItem();
                break;
            case 2:
                removeItem();
                break;
            case 3:
                updateQuantity();
                break;
        }

    }

    public void addItem() throws Exception {
        System.out.println("What is the name of the item?");
        String name = scannerStr.nextLine();

        System.out.println("What is the quantity of the item?");
        int quantity = Integer.parseInt(scannerInt.nextLine());

        System.out.println("What is the category of the item?");
        String category = scannerStr.nextLine();

        Main.inventory.add(Main.createItem(name, quantity, category));
    }

    public void removeItem() {
        System.out.println("Which item number would you like to remove?");
        int removeInt = Integer.parseInt(scannerInt.nextLine());

        Main.inventory.remove(removeInt);
    }

    public void updateQuantity() {
        System.out.println("Which item number would you like to update?");

        int updateItemInt = Integer.parseInt(scannerInt.nextLine());

        System.out.println("What is the correct inventory?");

        int updateQuantity = Integer.parseInt(scannerInt.nextLine());

        Main.inventory.get(updateItemInt).setQuantity(updateQuantity);
    }

    public OptionMenu() {
    }

}
