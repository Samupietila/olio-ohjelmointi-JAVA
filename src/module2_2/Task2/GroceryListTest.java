package module2_2.Task2;

public class GroceryListTest {
    public static void main(String[] args) {
        GroceryListManager groceries = new GroceryListManager();
        System.out.println("Grocery List:");
        groceries.addItem("Apples", 1.2);
        groceries.addItem("Milk", 1.2);
        groceries.addItem("Bread", 2);
        groceries.displaylist();
        System.out.println();
        groceries.checkItem("Milk");
        System.out.println();
        groceries.removeItem("Milk");
        System.out.println();
        System.out.println("Updated Grocery List:");
        groceries.displaylist();
        System.out.println();
        groceries.addItemInput();
        System.out.println();
        System.out.println("Updated Grocery List:");
        groceries.displaylist();
        System.out.println();
        System.out.println("Total cost: ");
        groceries.calculateTotalCost();


    }
}
