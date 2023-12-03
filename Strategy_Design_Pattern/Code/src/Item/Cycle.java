package Item;

import Strategy.NonMotorDriveStrategy;

public class Cycle extends Vehicle {
    public Cycle()
    {
        super(new NonMotorDriveStrategy());
    }
}
