
public class MovieTicketBooking {
    private String movieName;
    private String seatNumber;

    // Instance initializer block
    {
        System.out.println("Booking Started");
    }

    // Default constructor creating a regular ticket
    public MovieTicketBooking() {
        // Chains to the constructor with one parameter
        this("Regular Movie");
    }

    // Overloaded constructor accepting movie name
    public MovieTicketBooking(String movieName) {
        // Chains to the constructor with two parameters
        this(movieName, "Not Assigned");
    }

    // Overloaded constructor accepting movie name and seat number
    public MovieTicketBooking(String movieName, String seatNumber) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
    }

    // Method to display booking details
    public void displayDetails() {
        System.out.println("Movie: " + this.movieName);
        System.out.println("Seat No: " + this.seatNumber);
    }

    public static void main(String[] args) {
        // Simulating the example output with "Avengers" and "A12"
        MovieTicketBooking ticket = new MovieTicketBooking("Avengers", "A12");
        ticket.displayDetails();
    }
}