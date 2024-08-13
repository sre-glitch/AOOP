package two_b;

public class CreditCardFactory extends PaymentGatewayFactory {
    public PaymentGateway createPaymentGateway() {
        return new CreditCardPayment();
    }
}

