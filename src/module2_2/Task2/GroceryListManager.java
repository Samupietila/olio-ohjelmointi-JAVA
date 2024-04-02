package module2_2.Task2;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class GroceryListManager {
    Map<String, Double> groceryList = new HashMap<>();

   void addItem(String item, double price) {
       if (groceryList.containsValue(item))
           System.out.println("This item is already in the list.");
       else {
           groceryList.put(item, price);
       }
   }
   void addItemInput() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the item you want to put into the grocery list:");
      String  item = sc.nextLine();
       System.out.println("Enter the price of the item.");
       double price = sc.nextDouble();
       if (groceryList.containsValue(item))
           System.out.println("This item is already in the list.");
       else {
           groceryList.put(item, price);
       }
   }
   void removeItem(String item){
       if (groceryList.containsKey(item)) {
           groceryList.remove(item);
           System.out.println("Removing '"+ item +"' from the list...");
       }
       else {
           System.out.println("Grocery list does not have this item.");
       }
   }
   void displaylist(){
       int i = 1;
       double sum = 0;
       for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
           String item = entry.getKey();
           Double price = entry.getValue();
           System.out.println(i + ". " + item + ": " + price + "€");
           sum += price;
           i++;
       }
       System.out.println("Overall sum: " + sum + "€.");
   }
  void checkItem(String item){
      System.out.println("Is " + item + " in the grocery list? " + groceryList.containsKey(item));
  }
    void calculateTotalCost(){
        double sum = 0;
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            Double price = entry.getValue();
            sum += price;
        }
        System.out.println("Overall sum: " + sum + "€.");
    }

}