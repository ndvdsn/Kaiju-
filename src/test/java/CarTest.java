import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void setUp(){
        car = new Car("Big Honda", 12, 8);
    }

    @Test
    public void hasType(){
        assertEquals("Big Honda", car.getType());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(12, car.getHealthValue());
    }
}
