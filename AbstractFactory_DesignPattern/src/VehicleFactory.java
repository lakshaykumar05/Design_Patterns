import VehicleTypes.LuxuryVehicle;
import VehicleTypes.OrdinaryVehicle;
import VehicleTypes.VehicleType;

/**
 * VehicleFactory
 */
public class VehicleFactory {

    public VehicleFactory()
    {

    }

    public VehicleType getVehicleType(int price)
    {
        if(price > 2000000)
            return new LuxuryVehicle(price);
        else
            return new OrdinaryVehicle(price);
    }
}