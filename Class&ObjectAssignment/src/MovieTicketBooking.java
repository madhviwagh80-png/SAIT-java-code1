
class MovieTicket {
    // Private variables (Encapsulation)
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    // Constructor to initialize variables
    public MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    // Getters
    public String getMovieName() {
        return movieName;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    // Getter logic to calculate total cost with conditional discount
    public double getTotalCost() {
        double totalCost = numberOfTickets * ticketPrice;
        
        // If tickets are 5 or more, apply a 5% discount
        if (numberOfTickets >= 5) {
            totalCost -= totalCost * 0.05; // Deducts 5% discount
        }
        
        return totalCost;
    }

    // Method to display movie name and total price
    public void displayTicketDetails() {
        System.out.println("Movie Name  : " + getMovieName());
        System.out.println("Total Price : $" + getTotalCost());
        System.out.println("--------------------------------");
    }
}

// Main class to test the implementation
public class MovieTicketBooking{
    public static void main(String[] args) {
        System.out.println("----- Ticket Booking Summary -----");
        
        // Test Case 1: Less than 5 tickets (No Discount)
        MovieTicket ticket1 = new MovieTicket("Saiyaara", 12.0, 3);
        ticket1.displayTicketDetails();

        // Test Case 2: 5 or more tickets (5% Discount Applied)
        MovieTicket ticket2 = new MovieTicket("Dhurandar", 12.0, 5);
        ticket2.displayTicketDetails();
    }
}