package com.theironyard.charlotte;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<InventoryItem> inventory = new ArrayList<>();


    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scanner = new Scanner(System.in);


        while(true) {
            System.out.println("1. Create new item");
            System.out.println("2. Remove an item");
            System.out.println("3. Update an item's quantity");


            String option = scanner.nextLine();


            if (option.equals("1")) {
                //static method for createItem
                System.out.println("What is the name of the item?");
                String name = scanner.nextLine();

                System.out.println("What is the quantity of the item?");
                String quant = scanner.nextLine();
                int quantity = Integer.parseInt(quant);

                System.out.println("What is the category of the item?");
                String category = scanner.nextLine();

                inventory.add(InventoryItem.createItem(name, quantity, category));


            } else if (option.equals("2")) {
                //code for remove item
                System.out.println("Which item number would you like to remove?");

                String remove = scanner.nextLine();
                int removeInt = Integer.parseInt(remove);

                inventory.remove(removeInt);

            } else if (option.equals("3")) {
                //code for update quantity
                System.out.println("option 3 works");
            }


            for (int i = 0; i < inventory.size(); i++) {
                System.out.println(inventory.get(i));
            }

        }
    }
}



