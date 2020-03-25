package vehicleType;

import vehicle.Engine;
import vehicle.Tyres;
import vehicle.Vehicle;

public class VehicleType extends Vehicle {

    //instance vars
    String fuelSource;

    // constructor
    public VehicleType(String fuelSource, Engine engine, Tyres tyres, String colour, int price, String make, String model){
//        super(make, model, engine, colour, price, make, model);
        super(make, model,engine, tyres, colour, price);
        this.fuelSource = fuelSource;
    }

}
