package Items;

import Strategy.PriceStrategy;

public class MainVehicle {
    
    PriceStrategy priceStrategy;

    public MainVehicle(PriceStrategy priceStrategy)
    {
        this.priceStrategy = priceStrategy;
    }

    public int getParkingPrice()
    {
        return this.priceStrategy.getPrice();
    }
}
