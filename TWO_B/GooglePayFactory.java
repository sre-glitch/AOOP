package two_b;

public class GooglePayFactory extends PaymentGatewayFactory {
    public PaymentGateway createPaymentGateway() {
        return new GooglePayPayment();
    }
}
