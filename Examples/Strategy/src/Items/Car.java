package Items;

import Strategy.MoreThenTwoWheelerPriceStrategy;

public class Car extends MainVehicle{
    public Car()
    {
        super(new MoreThenTwoWheelerPriceStrategy());
    }
}
