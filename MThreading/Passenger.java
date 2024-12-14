// Passenger class implementing Runnable
class Passenger implements Runnable {
    private final TicketBookingSystem bookingSystem;
    private final String passengerName;
    private final int ticketsToBook;

    public Passenger(TicketBookingSystem bookingSystem, String passengerName, int ticketsToBook) {
        this.bookingSystem = bookingSystem;
        this.passengerName = passengerName;
        this.ticketsToBook = ticketsToBook;
    }

    @Override
    public void run() {
        bookingSystem.bookTicket(passengerName, ticketsToBook);
    }
}
