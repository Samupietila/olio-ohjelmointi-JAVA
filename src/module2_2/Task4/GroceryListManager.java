package module2_2.Task4;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class GroceryListManager {

    Map<String, Map<String, Object>> groceryList = new HashMap<>();

    void displayItems(){
        System.out.println("Grocery list:");
        for(Map.Entry<String, Map<String, Object>> categoryEntry : groceryList.entrySet() ){
            String category = categoryEntry.getKey();
            System.out.println(category);
            Map<String, Object> itemsMap = categoryEntry.getValue();
            for(Map.Entry<String, Object> itemEntry : itemsMap.entrySet()) {
                String item = itemEntry.getKey();
                Map<String, Object> itemData = (Map<String, Object>) itemEntry.getValue();
                int quantity = (int) itemData.get("quantity");
                double price = (double) itemData.get("price");
                if(quantity > 0) {
                    System.out.println("\t" + item + ", quantity: " + quantity + ", price: " + price + "€");
                }
            }
        }
    }

    public void addItem(String category, String item, double price, int quantity){
        if(!groceryList.containsKey(category)){
            groceryList.put(category, new HashMap<>());
        }
        Map<String, Object> itemData = new HashMap<>();
        itemData.put("price", price);
        itemData.put("quantity", quantity);
        groceryList.get(category).put(item,itemData);
    }

    void checkItem(String item, int quantity) {
        boolean itemExists = false;
        for (Map.Entry<String, Map<String, Object>> categoryEntry : groceryList.entrySet()) {
            Map<String, Object> itemsMap = categoryEntry.getValue();
            if (itemsMap.containsKey(item)) {
                itemExists = true;
                for (Map.Entry<String, Object> itemEntry : itemsMap.entrySet()) {
                    String checkedItem = itemEntry.getKey();
                    if (checkedItem.equals(item)) {
                        Map<String, Object> itemData = (Map<String, Object>) itemEntry.getValue();
                        itemData.put("quantity", quantity);
                        System.out.println("Updated quantity: ");
                        System.out.println("\t" + item + ", quantity: " + quantity);
                    }
                }
            }
        }
        if(!itemExists)
            System.out.println("product not found.");
    }
}
