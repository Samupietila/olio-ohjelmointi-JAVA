package module5_2.Task2;

public class ListUser implements Runnable{
    private NumberList numberList;
    private static int idCounter = 0;
    private  int id;

    public ListUser(NumberList numberList, int id) {
        this.numberList = numberList;
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    @Override
    public void run() {
        double delay = Math.random()* 1000;
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("User " + id + " is trying to add number " + numberList.getNumber());
                numberList.addNumber();
                Thread.sleep((long) delay);
                System.out.println("User " + id + " is trying to remove number " + numberList.getNumber());
                numberList.removeNumber(numberList.getNumber());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
