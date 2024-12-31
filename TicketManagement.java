import java.util.ArrayList;
import java.util.Scanner;

class Ticket {
    private int id;
    private String passengerName;
    private String destination;
    private double price;

    public Ticket(int id, String passengerName, String destination, double price) {
        this.id = id;
        this.passengerName = passengerName;
        this.destination = destination;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", passengerName='" + passengerName + '\'' +
                ", destination='" + destination + '\'' +
                ", price=" + price +
                '}';
    }
}

public class TicketManagement {
    private static ArrayList<Ticket> tickets = new ArrayList<>();
    private static int nextId = 1;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nTrain Ticket Management System");
            System.out.println("1. Add Ticket");
            System.out.println("2. View Tickets");
            System.out.println("3. Update Ticket");
            System.out.println("4. Delete Ticket");
            System.out.println("5. View Extreme Prices");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addTicket();
                    break;
                case 2:
                    viewTickets();
                    break;
                case 3:
                    updateTicket();
                    break;
                case 4:
                    deleteTicket();
                    break;
                case 5:
                    viewExtremePrices();
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addTicket() {
        System.out.print("Enter passenger name: ");
        String name = scanner.nextLine();
        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        Ticket ticket = new Ticket(nextId++, name, destination, price);
        tickets.add(ticket);
        System.out.println("Ticket added successfully!");
    }

    private static void viewTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets found.");
            return;
        }

        System.out.println("\nList of Tickets:");
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }
    }

    private static void updateTicket() {
        System.out.print("Enter ticket ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                System.out.print("Enter new passenger name (current: " + ticket.getPassengerName() + "): ");
                String name = scanner.nextLine();
                System.out.print("Enter new destination (current: " + ticket.getDestination() + "): ");
                String destination = scanner.nextLine();
                System.out.print("Enter new price (current: " + ticket.getPrice() + "): ");
                double price = scanner.nextDouble();

                ticket.setPassengerName(name);
                ticket.setDestination(destination);
                ticket.setPrice(price);

                System.out.println("Ticket updated successfully!");
                return;
            }
        }

        System.out.println("Ticket with ID " + id + " not found.");
    }

    private static void deleteTicket() {
        System.out.print("Enter ticket ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                tickets.remove(ticket);
                System.out.println("Ticket deleted successfully!");
                return;
            }
        }

        System.out.println("Ticket with ID " + id + " not found.");
    }

    private static void viewExtremePrices() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets found.");
            return;
        }

        double minPrice = Double.MAX_VALUE;
        double maxPrice = Double.MIN_VALUE;

        for (Ticket ticket : tickets) {
            if (ticket.getPrice() < minPrice) {
                minPrice = ticket.getPrice();
            }
            if (ticket.getPrice() > maxPrice) {
                maxPrice = ticket.getPrice();
            }
        }

        System.out.println("\nExtreme Prices:");
        System.out.println("Minimum Price: " + minPrice);
        System.out.println("Maximum Price: " + maxPrice);
    }
}
