package module2_2.Task1;

import java.util.Scanner;
import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    void addItem(String item) {
        if (groceryList.contains(item))
            System.out.println("This item is already in the list.");
        else {
            groceryList.add(item);
        }
    }
    void addItemInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item you want to put into the grocery list:");
        String  item = sc.nextLine();
        if (groceryList.contains(item))
            System.out.println("This item is already in the list.");
        else {
            groceryList.add(item);
        }
    }
    void removeItem(String item){
        if (groceryList.contains(item)) {
            groceryList.remove(item);
            System.out.println("Removing '"+ item +"' from the list...");
        }
        else {
            System.out.println("Grocery list does not have this item.");
        }
    }
    void displaylist(){
        int i = 1;
        for (String s : groceryList) {
            System.out.println(i + ". " + s);
            i++;
        }
    }
    void checkItem(String item){
        System.out.println("Is " + item + " in the grocery list? " + groceryList.contains(item));
    }

}