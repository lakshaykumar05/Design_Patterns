package Java.Strategy_Design_Pattern.Code.src.Strategy;

public class MotorDriveStrategy implements DriveStrategy {
    public void drive() {
        System.out.println("Drive in MotorDriveStrategy");
    }
}
