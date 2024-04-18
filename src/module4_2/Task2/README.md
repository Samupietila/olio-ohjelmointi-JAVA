# Module 4.2 Task2
## Task description
Created a class 'Calculator' that has the ability to sum positive integer.
- The class has a method 'add' that takes a positive integer as a parameter and adds it to the sum.
- The class has a method 'reset' that resets the sum to 0.
- The class has a method 'get_sum' that returns the sum.

## Example
```javapackage module4_2.Task1;

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
```
## Explanation
- The class 'Calculator' has a private field 'sum' that stores the sum of the numbers.
- The class has a constructor that initializes the 'sum' to 0.
- The class has a methods 'reset' that resets the 'sum' to 0, 'add' that takes a positive integer as a parameter and adds it to the 'sum', 'get_sum' that returns the 'sum'.
- The main method creates an instance of the 'Calculator' class and adds some positive numbers to the sum.
- The main method prints the sum and resets the sum to 0 and catches any IllegalArgumentException thrown by the 'add' method and prints the error message.
- The output of the main method is:
```
Sum: 30
Sum after reset: 0
```
