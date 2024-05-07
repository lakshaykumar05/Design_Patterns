package Items;

import Strategy.TwoWheelerPriceStrategy;

public class Scooter extends MainVehicle {
    public Scooter()
    {
        super(new TwoWheelerPriceStrategy());
    }
}
