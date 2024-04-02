package module2_2.Task3;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class GroceryListManager {
    Map<String, Map<String, Double>> groceryList = new HashMap<>();

    void addItem(String category, String item, double price) {
        if (groceryList.containsKey(category) && groceryList.get(category).containsKey(item)) {
            System.out.println("This item is already in the list.");
        } else {
            if (!groceryList.containsKey(category)) {
                groceryList.put(category, new HashMap<>());
            }
            groceryList.get(category).put(item, price);
        }
    }

    void addItemInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the category of the item:");
        String category = sc.nextLine();
        System.out.println("Enter the item you want to put into the grocery list:");
        String item = sc.nextLine();
        System.out.println("Enter the price of the item.");
        double price = sc.nextDouble();
        if (groceryList.containsKey(category) && groceryList.get(category).containsKey(item)) {
            System.out.println("This item is already in the list.");
        } else {
            if (!groceryList.containsKey(category)) {
                groceryList.put(category, new HashMap<>());
            }
            groceryList.get(category).put(item, price);
        }
    }

    void removeItem(String category, String item) {
        if (groceryList.containsKey(category) && groceryList.get(category).containsKey(item)) {
            groceryList.get(category).remove(item);
            System.out.println("Removing '" + item + "' from the list...");
        } else {
            System.out.println("Grocery list does not have this item.");
        }
    }

    void displaylistByCategory(String category) {
        int i = 1;
        double sum = 0;
        System.out.println();
        if (groceryList.containsKey(category)) {
            Map<String, Double> items = groceryList.get(category);
            for (Map.Entry<String, Double> entry : items.entrySet()) {
                String item = entry.getKey();
                Double price = entry.getValue();
                System.out.println(i + ". " + item + ": " + price + "€");
                sum += price;
                i++;
            }
            System.out.println("Overall sum: " + sum + "€.");
        } else {
            System.out.println("Category " + category + " does not exist in the grocery ist");
        }
    }

    void displayList() {
        int i = 1;
        for (Map.Entry<String, Map<String, Double>> categoryEntry : groceryList.entrySet()) {
            String category = categoryEntry.getKey();
            Map<String, Double> items = categoryEntry.getValue();

            System.out.println("Category: " + category);

            double sum = 0;
            for (Map.Entry<String, Double> itemEntry : items.entrySet()) {
                String item = itemEntry.getKey();
                Double price = itemEntry.getValue();
                System.out.println(i + ". " + item + ": " + price + "€");
                sum += price;
                i++;
            }

            System.out.println("Total cost for " + category + ": " + sum + "€.");
        }}


    void checkItem(String item) {
        boolean itemExists = false;
        for (Map<String, Double> items : groceryList.values()) {
            if (items.containsKey(item)) {
                itemExists = true;
                break;
            }
        }
        System.out.println("Is " + item + " in the grocery list? " + itemExists);
    }


    void calculateTotalCost() {
        double sum = 0;
        for (Map<String, Double> items : groceryList.values()) {
            for (Double price : items.values()) {
                sum += price;
            }
        }
        System.out.println("Overall sum: " + sum + "€.");
    }
}
