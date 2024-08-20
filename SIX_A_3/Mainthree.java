package sixthree;

public class Mainthree {
	public static void main(String[] args) {
        CustomerSupportSystem supportSystem = new CustomerSupportSystem();
        
        supportSystem.addTicket("Alice", "Can't log in to my account");
        supportSystem.addTicket("Bob", "Payment issue");
        supportSystem.addTicket("Charlie", "Unable to reset password");
       
        supportSystem.displayPendingTickets();
        
        supportSystem.processNextTicket();
        
        supportSystem.displayPendingTickets();
        
        supportSystem.processNextTicket();
        
        supportSystem.displayPendingTickets();
    }
}
