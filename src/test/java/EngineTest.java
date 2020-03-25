import org.junit.Before;
import org.junit.Test;
import vehicle.Engine;

import static org.junit.Assert.assertEquals;

public class EngineTest {
    Engine engine;
    @Before
    public void before(){
        engine = new Engine(1800);
    }

    @Test
    public void hasEngineSize(){

        assertEquals(1800, engine.getEngineSize());

    }
}

