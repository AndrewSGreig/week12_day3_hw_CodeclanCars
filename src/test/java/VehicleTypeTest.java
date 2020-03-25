import org.junit.Before;
import org.junit.Test;
import vehicle.Engine;
import vehicle.Vehicle;
import vehicleType.VehicleType;
import vehicle.Tyres;

public class VehicleTypeTest {
    VehicleType vehicleType1;
    VehicleType vehicleType2;
    Engine engine1 = new Engine(1400);
    Engine engine2 = new Engine(1600);
    Engine engine3 = new Engine(1800);

    Tyres tyres1 = new Tyres("Goodyear", 14);
    Tyres tyres2 = new Tyres("Michelin", 16);
    Tyres tyres3 = new Tyres("Goodyear", 16);


    @Before
    public void before(){
//        VehicleType vehicleType1 = new VehicleType("Electric / Petrol", "Blue", 1400,"Honda", "Civic");
//        VehicleType vehicleType2 = new VehicleType("Electric / Petrol", "Black", 3500, "Vauxhall", "Grandland-X");

        VehicleType vehicleType1 = new VehicleType("Electric / Petrol", engine1, tyres1, "Blue", 14500, "Vauxhall", "Grandland-X");
        VehicleType vehicleType2 = new VehicleType("Electric", engine2, tyres2, "red", 25000, "Smart", "forfour" );
        VehicleType vehicleType3 = new VehicleType("Petrol", engine3, tyres3, "white", 26500, "Audi", "A3");
    }

//    @Test
//    public void testAddVehicles(){
//        VehicleType vehicleType1 = new VehicleType("Electric / Petrol", engine1, tyres, "Blue", 4500, "Toyota", "Prius");
//    }
//    public VehicleType getHybridVehicle1() {
//        return vehicleType1;
//    }
//
//    public void setHybridVehicle1(VehicleType vehicleType1) {
//        this.vehicleType1 = vehicleType1;
//    }
//
//    public VehicleType getHybridVehicle2() {
//        return vehicleType2;
//    }
//
//    public void setHybridVehicle2(VehicleType vehicleType2) {
//        this.vehicleType2 = vehicleType2;
//    }


}
