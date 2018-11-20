import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarfTest {

    Barf barf;

    @Before
    public void setUp(){
        barf = new Barf("Crayon", 5, 15);
    }

    @Test
    public void hasName(){
        assertEquals("Crayon", barf.getName());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(5, barf.getHealthValue());
    }

    @Test
    public void hasAttachValue() {
        assertEquals(15, barf.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("Roar", barf.roar());
    }
}
