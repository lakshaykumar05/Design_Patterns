package Items;

import Strategy.MoreThenTwoWheelerPriceStrategy;

public class Bus extends MainVehicle {
    public Bus()
    {
        super(new MoreThenTwoWheelerPriceStrategy());
    }
}
