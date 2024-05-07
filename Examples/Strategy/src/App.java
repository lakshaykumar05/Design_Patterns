import Items.Bike;
import Items.Bus;
import Items.Car;
import Items.MainVehicle;
import Items.Scooter;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting");

        MainVehicle scooter = new Scooter();
        System.out.println("scooter price " + scooter.getParkingPrice());

        MainVehicle bike = new Bike();
        System.out.println("bike price " + bike.getParkingPrice());

        MainVehicle car = new Car();
        System.out.println("car price " + car.getParkingPrice());
        
        MainVehicle bus = new Bus();
        System.out.println("bus price " + bus.getParkingPrice());

        System.out.println("Ending");
    }
}
