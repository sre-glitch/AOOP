package two_b;

public class CreditCardPayment implements PaymentGateway {
    public void executePayment(double amount) {
        System.out.println("Credit Card payment executed.");
    }
}

