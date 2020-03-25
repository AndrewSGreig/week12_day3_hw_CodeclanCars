import org.junit.Before;
import org.junit.Test;
import vehicle.Engine;
import vehicle.Tyres;
import vehicle.Vehicle;
import vehicleType.VehicleType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    int till;

    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    Engine engine1 = new Engine(1400);
    Engine engine2 = new Engine(1600);
    Engine engine3 = new Engine(1800);
    Engine engine4 = new Engine(3800);

    Tyres tyres1 = new Tyres("Goodyear", 14);
    Tyres tyres2 = new Tyres("Michelin", 16);
    Tyres tyres3 = new Tyres("Goodyear", 16);
    Tyres tyres4 = new Tyres("Pirelli", 16);

    VehicleType vehicleType1 = new VehicleType("Electric / Petrol", engine1, tyres1, "Blue", 14500, "Vauxhall", "Grandland-X");
    VehicleType vehicleType2 = new VehicleType("Electric", engine2, tyres2, "red", 25000, "Smart", "forfour" );
    VehicleType vehicleType3 = new VehicleType("Petrol", engine3, tyres3, "white", 26500, "Audi", "A3");

    Dealership dealership = new Dealership(vehicles, till);

    @Before
    public void before(){
        till = 567;
        vehicles.add(vehicleType1);
        vehicles.add(vehicleType2);
        vehicles.add(vehicleType3);
        dealership = new Dealership(vehicles, till);

    }

    @Test
    public void ensureCarsArePresent(){
        assertEquals(3, dealership.getNoOfVehicles());
    }

    @Test
    public void testAddCarToDealership(){
        VehicleType vehicleType4 = new VehicleType("Petrol", engine4, tyres4, "white", 208600, "McLaren", "720s");
        dealership.addToVehicleList(vehicleType4);
        System.out.println(this.vehicles.get(3).getMake());
        assertEquals("McLaren", this.vehicles.get(3).getMake());
        assertEquals(4, this.vehicles.size());
    }

    @Test
    public void testTillValue(){
        assertEquals(567, dealership.getTill());
    }

    @Test
    public void testIncreaseTill(){
        dealership.increaseTill(111);
        assertEquals(678, dealership.getTill());
    }

    @Test
    public void testDecreaseTill(){
        dealership.decreaseTill(111);
        assertEquals(456, dealership.getTill());

    }
}

