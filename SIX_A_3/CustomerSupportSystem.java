package sixthree;

import java.util.LinkedList;
import java.util.Queue;

public class CustomerSupportSystem {
	private Queue<Ticket> ticketQueue;

    public CustomerSupportSystem() {
        this.ticketQueue = new LinkedList<>(); 
        System.out.println("Customer Support Ticket System initialized.");
    }

    public void addTicket(String customerName, String issueDescription) {
        Ticket newTicket = new Ticket(customerName, issueDescription);
        ticketQueue.add(newTicket); 
        System.out.println("New ticket added: " + newTicket);
    }

    public void processNextTicket() {
        if (!ticketQueue.isEmpty()) {
            Ticket nextTicket = ticketQueue.poll(); 
            System.out.println("Processing and removing the next ticket: " + nextTicket);
        } else {
            System.out.println("No tickets to process.");
        }
    }
    public void displayPendingTickets() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No pending tickets.");
        } else {
            System.out.println("Displaying all pending tickets:");
            for (Ticket ticket : ticketQueue) {
                System.out.println(ticket);
            }
        }
    }
}
