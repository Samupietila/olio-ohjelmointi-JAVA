package module2_2.Task3;

public class GroceryListTest {
    public static void main(String[] args) {
        GroceryListManager groceries = new GroceryListManager();
        System.out.println("Grocery List:");
        groceries.addItem("Fruits","Apples", 1.2);
        groceries.addItem("Dairy","Milk", 1.2);
        groceries.addItem("Bakery","Bread", 2);
        groceries.displaylistByCategory("Dairy");
        System.out.println();
        groceries.checkItem("Apples");
        System.out.println();
        groceries.removeItem("Dairy", "Milk");
        System.out.println();
        System.out.println("Updated Grocery List:");
        groceries.displaylistByCategory("Dairy");
        System.out.println();
        groceries.addItemInput();
        System.out.println();
        System.out.println("Updated Grocery List:");
        groceries.displayList();
        System.out.println();
        System.out.println("Total cost: ");
        groceries.calculateTotalCost();


    }
}
