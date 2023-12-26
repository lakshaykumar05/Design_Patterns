package VehicleTypes;

import Vehicles.Alto;
import Vehicles.Swift;
import Vehicles.Vehicle;
import Vehicles.Vehicle;

public class OrdinaryVehicle implements VehicleType{

    public int price;

    public OrdinaryVehicle(int price)
    {
        this.price = price;
    }

    public Vehicle giveVehicle()
    {
        if(this.price > 1000000)
            return new Swift();
        else
            return new Alto();
    }
}
