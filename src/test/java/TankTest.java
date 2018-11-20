import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TankTest {

    Tank tank;
    Mellie mellie;

    @Before
    public void setUp(){
        tank = new Tank("Trumpet", 44, 22);
        mellie = new Mellie("Hugo", 30, 20);
    }

    @Test
    public void hasType() {
        assertEquals("Trumpet", tank.getType());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(44, tank.getHealthValue());
    }
}
