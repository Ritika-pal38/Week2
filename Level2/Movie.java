import java.util.Scanner;

public class Movie{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the movie ticket details
        System.out.println("Enter the movie name:");
        String movieName = sc.nextLine();

        System.out.println("Enter the ticket price:");
        double price = sc.nextDouble();

        // Create an instance of the MovieTicket class
        MovieTicket ticket = new MovieTicket(movieName, price);

        // Book a ticket by assigning a seat number
        System.out.println("Enter the seat number to book:");
        int seatNumber = sc.nextInt();
        ticket.bookTicket(seatNumber);

        // Display ticket details
        ticket.displayTicketDetails();

        sc.close();
    }
}

class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor to initialize movie name and ticket price
    public MovieTicket(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
        this.isBooked = false; // Initially, the ticket is not booked
    }

    // Method to book a ticket
    public void bookTicket(int seatNumber) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            isBooked = true;
            System.out.println("Ticket successfully booked for seat number " + seatNumber + ".");
        } else {
            System.out.println("Ticket is already booked!");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("\n--- Ticket Details ---");
        System.out.println("Movie Name: " + movieName);
        if (isBooked) {
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("No ticket has been booked yet.");
        }
    }
}
     