package module5_2.Task1;

import java.math.BigInteger;

public class Customer implements Runnable{
    private int id;
    private static int idCounter = 0;
    private int reservedTickets;

    public Customer(){
        this.id = ++idCounter;
        reservedTickets = 0;
    }
    @Override
    public void run(){
        int randomNumber = (int) (Math.random() * 4) + 1;
        if (TicketReservationSystem.reserveTicket(BigInteger.valueOf(randomNumber))){
            reservedTickets += randomNumber;
            System.out.println("Customer " + id + " has reserved " + reservedTickets + " tickets");
        } else {
            System.out.println("Customer " + id + " failed to reserve " + randomNumber + " tickets");
        }
    }

    public int getReservedTickets() {
        return reservedTickets;
    }
}
