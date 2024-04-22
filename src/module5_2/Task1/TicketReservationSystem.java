package module5_2.Task1;

import java.math.BigInteger;

public class TicketReservationSystem{
    private static BigInteger ticketsCount;

    public TicketReservationSystem() {
        ticketsCount = BigInteger.TEN;
    }

    public static synchronized boolean reserveTicket(BigInteger amount) {
        BigInteger result = ticketsCount.subtract(amount);
        if (result.signum() == -1) {
            return false;
        } else {
            ticketsCount = result;
            return true;
        }
    }

    public static BigInteger getTicketsCount() {
        return ticketsCount;
    }
}
