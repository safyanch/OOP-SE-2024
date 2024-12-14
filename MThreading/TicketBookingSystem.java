class TicketBookingSystem {
    private int availableTickets;

    public TicketBookingSystem(int totalTickets) {
        this.availableTickets = totalTickets;
    }

    // Synchronized method to book a ticket
    public synchronized boolean bookTicket(String passengerName, int numberOfTickets) {
        if (numberOfTickets <= availableTickets) {
            System.out.println(passengerName + " is booking " + numberOfTickets + " ticket(s).");
            availableTickets -= numberOfTickets;
            System.out.println("Booking successful! Remaining tickets: " + availableTickets);
            return true;
        } else {
            System.out.println("Booking failed for " + passengerName + ". Not enough tickets available.");
            return false;
        }
    }
}
