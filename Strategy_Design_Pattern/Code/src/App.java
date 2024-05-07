import Item.Cycle;
import Item.Bus;
import Item.Car;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, in Strategy Design Pattern!");

        Bus bus = new Bus();
        bus.drive();

        Car car = new Car();
        car.drive();

        Cycle cycle = new Cycle();
        cycle.drive();

        System.out.println("Bye, in Strategy Design Pattern!");
    }
}
