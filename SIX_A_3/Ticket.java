package sixthree;

public class Ticket {
	private String customerName;
    private String issueDescription;

    public Ticket(String customerName, String issueDescription) {
        this.customerName = customerName;
        this.issueDescription = issueDescription;
        System.out.println("Ticket created for " + customerName + ": " + issueDescription);
    }

    @Override
    public String toString() {
        return "Customer: " + customerName + " | Issue: " + issueDescription;
    }
}
