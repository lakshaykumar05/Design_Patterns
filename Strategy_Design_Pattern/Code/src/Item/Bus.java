package Item;

import Strategy.MotorDriveStrategy;

public class Bus extends Vehicle {
    public Bus()
    {
        super(new MotorDriveStrategy());
    }
}
