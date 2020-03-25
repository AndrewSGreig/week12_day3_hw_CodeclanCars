import org.junit.Before;
import org.junit.Test;
import vehicle.Tyres;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyre1;
    Tyres tyre2;


    @Before
    public void before(){
        //String manufacturer, int size, String colour, int price, String make, String model)
        tyre1 = new Tyres("Goodyear", 14);
        tyre2 = new Tyres("Michelin", 16);
    }

    @Test
    public void testGetTyreManufacturer(){
        assertEquals("Goodyear", tyre1.getManufacturer());
        assertEquals("Michelin", tyre2.getManufacturer());
    }

    @Test
    public void testGetTyreSize(){
        assertEquals(16, tyre2.getSize());
    }

}
