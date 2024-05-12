package Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(20);
        numbers.add(15);
        numbers.add(3);
        numbers.add(12);

        numbers.removeIf(n -> n % 2 == 0);

        numbers.replaceAll(n -> n * 2);

        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }

        System.out.println("The sum is: " + sum);
    }
}