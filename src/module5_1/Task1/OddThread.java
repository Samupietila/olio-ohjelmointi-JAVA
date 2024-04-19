package module5_1.Task1;

public class OddThread extends Thread{
    private int maxNumber;

    public OddThread(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= maxNumber; i += 2) {
            System.out.println("Odd Thread: "+i);
        }
    }
}

