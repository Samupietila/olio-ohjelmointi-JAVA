package module2_2.Task4;

public class GroceryListTest {
    public static void main(String[] args) {
        GroceryListManager groceries = new GroceryListManager();
        groceries.addItem("Fruits","Apples", 1.2, 0);
        groceries.addItem("Dairy","Milk", 1.23, 34);
        groceries.addItem("Fruits","Pears", 1.2, 0);
        groceries.addItem("Fruits","Pineapples", 1.2, 1);
        groceries.displayItems();
        groceries.checkItem("Milk", 2);
        groceries.checkItem("Joo", 4);

    }
}
