package com.theironyard.charlotte;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<InventoryItem> inventory = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create new item");
            System.out.println("2. Remove an item");
            System.out.println("3. Update an item's quantity");

            String option = scanner.nextLine();

            if (option.equals("1")) {
                //static method for creatItem
                System.out.println("option 1 works");
            }
            else if (option.equals("2")) {
                //code for remove item
                System.out.println("option 2 works");
            }
            else if (option.equals("3")) {
                //code for update quantity
                System.out.println("option 3 works");
            }


/*
            String name = scanner.nextLine();

            String quant = scanner.nextLine();
            int quantity = Integer.parseInt(quant);


        public static InventoryItem createItem(String category) {
            if (category.equals("Accessories")) {
                return new Accessories(name, quantity);
                // use switch statement

            }









*/
        }
    }
}
