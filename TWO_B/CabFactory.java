package two_b;

public class CabFactory extends VehicleFactory {
    public Vehicle createVehicle() {
        return new Cab();
    }
}
