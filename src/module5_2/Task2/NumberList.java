package module5_2.Task2;

import java.util.ArrayList;

public class NumberList {
    ArrayList<Integer> list = new ArrayList<>();

    private static int number = 0;

    public NumberList() {;
    }

    public String getListSize() {
        return "List size: " + list.size();
    }
    public synchronized void addNumber() {
        if (!list.contains(number))
            list.add(++number);
    }
    public synchronized void removeNumber(int number) {
        if (list.contains(number)) {
            list.remove(list.indexOf(number));
            System.out.println("Number " + number + " removed from the list");
        } else {
            System.out.println("Number " + number + " not found in the list");
        }
    }
    public int getNumber() {
        return number;
    }
    public void printList() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
