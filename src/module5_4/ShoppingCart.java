package module5_4;

import java.util.HashMap;

public class ShoppingCart {
    private HashMap<String, Double> items = new HashMap<>();

    private double totalPrice;

    public ShoppingCart() {
        totalPrice = 0.0;
        items = new HashMap<>();
    }

    public void addItem(String item, double price) {
        items.put(item, price);
    }
    public void removeItem(String item) {
        items.remove(item);
    }
    public int getItemCount() {
        return items.size();
    }
    public double calculateTotal() {
        for (double price : items.values()) {
            totalPrice += price;
        }
        return totalPrice;
    }

}
