package Items;

import Strategy.TwoWheelerPriceStrategy;

public class Bike extends MainVehicle {
    public Bike()
    {
        super(new TwoWheelerPriceStrategy());
    }
}
