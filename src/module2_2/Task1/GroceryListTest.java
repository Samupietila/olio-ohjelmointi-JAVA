package module2_2.Task1;

public class GroceryListTest {
    public static void main(String[] args) {
        GroceryListManager groceries = new GroceryListManager();
        System.out.println("Grocery List:");
        groceries.addItem("Apples");
        groceries.addItem("Milk");
        groceries.addItem("Bread");
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
        groceries.displaylist();


    }
}
