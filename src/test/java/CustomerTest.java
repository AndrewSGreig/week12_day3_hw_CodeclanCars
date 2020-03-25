import org.junit.Before;
import org.junit.Test;
import vehicle.Engine;
import vehicle.Tyres;
import vehicle.Vehicle;
import vehicleType.VehicleType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    int cash;

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

    Customer customer = new Customer(vehicles, cash);

    @Before
    public void before(){
        cash = 345;
        vehicles.add(vehicleType1);
        vehicles.add(vehicleType2);
        vehicles.add(vehicleType3);
        customer = new Customer(vehicles, cash);


    }

    @Test
    public void ensureCarsArePresent(){
        assertEquals(3, customer.getNoOfVehicles());
    }

    @Test
    public void testAddCarToCustomer(){
        VehicleType vehicleType4 = new VehicleType("Petrol", engine4, tyres4, "white", 208600, "McLaren", "720s");
        customer.addToVehicleList(vehicleType4);
//        System.out.println(customer.vehicles.get(3));
        assertEquals("McLaren", customer.vehicles.get(3).getMake());
    }

    @Test
    public void testTillValue(){
        assertEquals(345, customer.getCash());
    }

    @Test
    public void testIncreaseCash(){
        customer.increaseCash(111);
        assertEquals(456, customer.getCash());
    }

    @Test
    public void testDecreaseTill(){
        customer.decreaseCash(111);
        assertEquals(234, customer.getCash());

    }

}
