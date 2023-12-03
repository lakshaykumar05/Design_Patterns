package Item;

import Strategy.MotorDriveStrategy;

public class Car extends Vehicle {
    
    public Car()
    {
        super(new MotorDriveStrategy());
    }
}
