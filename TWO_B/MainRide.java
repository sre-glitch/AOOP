package two_b;

public class MainRide {
    public static void main(String[] args) {

        VehicleFactory cabFactory = new CabFactory();
        Vehicle cab = cabFactory.createVehicle();
        cab.initiate();

        VehicleFactory scooterFactory = new ScooterFactory();
        Vehicle scooter = scooterFactory.createVehicle();
        scooter.initiate();

        PaymentGatewayFactory creditCardFactory = new CreditCardFactory();
        PaymentGateway creditCardPayment = creditCardFactory.createPaymentGateway();
        creditCardPayment.executePayment(75.0);

        UserSessionManager sessionManager = UserSessionManager.getInstance();
        sessionManager.startSession("Sreya", "securePassword");
        sessionManager.getActiveUser();}}