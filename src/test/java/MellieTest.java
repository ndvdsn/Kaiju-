import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MellieTest {

    Mellie mellie;
    Tank tank;

    @Before
    public void setUp(){
        mellie = new Mellie("Burger", 20, 10);
        tank = new Tank("Euphonium", 13, 13);
    }

    @Test
    public void hasName(){
        assertEquals("Burger", mellie.getName());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(10, mellie.getHealthValue());
    }

    @Test
    public void hasAttachValue() {
        assertEquals(10, mellie.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("Roar", mellie.roar());
    }

    @Test
    public void canAttack(){
        mellie.attack(tank);
        assertEquals(3, tank.getHealthValue());

    }

    @Test
    public void canTakeDamage(){
        mellie.takeDamage(tank.getAttackValue());
        assertEquals(7, mellie.getHealthValue());
    }
}
