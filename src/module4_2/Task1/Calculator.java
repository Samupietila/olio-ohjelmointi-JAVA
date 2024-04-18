package module4_2.Task1;

public class Calculator {
    private int sum;

    public Calculator() {
        this.sum = 0;
    }

    public void reset() {
        this.sum = 0;
    }

    public void add(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        this.sum += number;
    }

    public int getSum() {
        return this.sum;
    }
    public static void main(String[] args) {
    Calculator calculator = new Calculator();
    try {
        calculator.add(5);
        calculator.add(10);
        calculator.add(15);
        System.out.println("Sum: " + calculator.getSum());
        calculator.reset();
        System.out.println("Sum after reset: " + calculator.getSum());
    } catch (IllegalArgumentException e) {
        System.err.println(e.getMessage());
    }
}
}
