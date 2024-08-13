package two_b;

public class GooglePayPayment implements PaymentGateway {
    public void executePayment(double amount) {
        System.out.println("Google Pay payment executed.");
    }
}
