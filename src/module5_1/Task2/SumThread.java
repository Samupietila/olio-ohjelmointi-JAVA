package module5_1.Task2;

class SumThread extends Thread {
    private int number1, number2, number3;
    private int sum;

    public SumThread(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public void run() {
            sum += number1 + number2 + number3;
        System.out.println("Sum: " + sum);
    }

    public int getSum() {
        return sum;
    }
}
