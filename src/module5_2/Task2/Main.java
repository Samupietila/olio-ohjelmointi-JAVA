package module5_2.Task2;

public class Main {
    public static void main(String[] args) {
        NumberList numberList = new NumberList();
        ListUser listUser1 = new ListUser(numberList, 1);
        ListUser listUser2 = new ListUser(numberList, 2);
        Thread thread1 = new Thread(listUser1);
        Thread thread2 = new Thread(listUser2);
        thread1.start();thread2.start();
        try{
            thread1.join(); thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        numberList.printList();
    }
}
