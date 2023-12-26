package VehicleTypes;

import Vehicles.Alto;
import Vehicles.Audi;
import Vehicles.Bmw;
import Vehicles.Swift;
import Vehicles.Vehicle;

public class LuxuryVehicle implements VehicleType {
    public int price;

    public LuxuryVehicle(int price)
    {
        this.price = price;
    }

    public Vehicle giveVehicle()
    {
        if(this.price > 3000000)
            return new Bmw();
        else
            return new Audi();
    }
}
