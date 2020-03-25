import vehicle.Engine;
import vehicle.Tyres;
import vehicle.Vehicle;
import vehicleType.VehicleType;

import java.util.ArrayList;

public class Customer extends VehicleArray {
    //instance vars
    int cash;

    Engine engine1 = new Engine(1400);
    Tyres tyres1 = new Tyres("Goodyear", 14);
    VehicleType vehicleType1 = new VehicleType("Electric / Petrol", engine1, tyres1, "Blue", 14500, "Vauxhall", "Grandland-X");

    public Customer(ArrayList<Vehicle> vehicles, int cash) {
        super(vehicles);
        this.cash = cash;
    }


    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void increaseCash(int increaseBy){
        this.cash += increaseBy;
    }

    public void decreaseCash(int decreaseBy){
        this.cash -= decreaseBy;
    }
}
