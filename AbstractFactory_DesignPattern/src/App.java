import VehicleTypes.VehicleType;
import Vehicles.Vehicle;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, in AbstractFactory Design Pattern!");

        VehicleFactory vehicleFactory = new VehicleFactory();

        VehicleType vehicleType = vehicleFactory.getVehicleType(18200000);

        Vehicle vehicle = vehicleType.giveVehicle();

        String result = vehicle.drive();

        System.out.println(result);

        System.out.println("Bye, in AbstractFactory Design Pattern!");
    }
}
