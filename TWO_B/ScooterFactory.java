package two_b;

public class ScooterFactory extends VehicleFactory {
    public Vehicle createVehicle() {
        return new Scooter();
    }
}
