// Program 14
// Question: Create a MovieTicket class with seat price and available seats.

class MovieTicket {
    double seatPrice;
    int availableSeats;

    MovieTicket(double price, int seats) {
        seatPrice = price;
        availableSeats = seats;
    }

    void displayTicketDetails() {
        System.out.println("Ticket Price: Rs. " + seatPrice);
        System.out.println("Available Seats Left: " + availableSeats);
    }
}

public class Program14 {
    public static void main(String[] args) {
        MovieTicket show = new MovieTicket(250.50, 45);
        show.displayTicketDetails();
    }
}

/*
Output:
Ticket Price: Rs. 250.5
Available Seats Left: 45
*/
