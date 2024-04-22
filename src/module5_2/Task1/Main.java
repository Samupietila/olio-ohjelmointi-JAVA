package module5_2.Task1;

public class Main {

    public static void main(String[] args) {
        TicketReservationSystem ticketReservationSystem = new TicketReservationSystem();
        System.out.println("Start: "+ ticketReservationSystem.getTicketsCount());
        Thread customer1 = new Thread(new Customer());
        Thread customer2 = new Thread(new Customer());
        Thread customer3 = new Thread(new Customer());
        Thread customer4 = new Thread(new Customer());
        Thread customer5 = new Thread(new Customer());

        customer1.start(); customer2.start(); customer3.start(); customer4.start(); customer5.start();

        try {
            customer1.join(); customer2.join(); customer3.join(); customer4.join(); customer5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End: "+ ticketReservationSystem.getTicketsCount());

    }
}
