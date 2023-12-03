package Item;

import Strategy.DriveStrategy;

public class Vehicle {
    
    DriveStrategy driveStrategyObject;

    Vehicle(DriveStrategy driveStrategy)
    {
        this.driveStrategyObject = driveStrategy;
    }

    public void drive()
    {
        this.driveStrategyObject.drive();
    }

}
