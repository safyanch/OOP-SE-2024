public class TicketBookingExample {
    public static void main(String[] args) {
        // Total tickets available in the system
        int totalTickets = 10;

        // Create the TicketBookingSystem instance
        TicketBookingSystem bookingSystem = new TicketBookingSystem(totalTickets);

        // Create multiple passenger threads
        Thread passenger1 = new Thread(new Passenger(bookingSystem, "Alice", 3));
        Thread passenger2 = new Thread(new Passenger(bookingSystem, "Bob", 5));
        Thread passenger3 = new Thread(new Passenger(bookingSystem, "Charlie", 4));
        Thread passenger4 = new Thread(new Passenger(bookingSystem, "Diana", 2));

        // Start the passenger threads
        passenger1.start();
        passenger2.start();
        passenger3.start();
        passenger4.start();

        // Wait for all threads to finish
        try {
            passenger1.join();
            passenger2.join();
            passenger3.join();
            passenger4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Ticket booking process completed.");
    }
}