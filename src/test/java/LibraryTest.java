import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Tank tank;
    Mellie mellie;

    @Before
    public void setUp(){

        library = new Library("Big One", 5000);
        tank = new Tank("Trumpet", 44, 2000);
        mellie = new Mellie("Hugo", 30, 20);
    }

    @Test
    public void hasType() {
        assertEquals("Big One", library.getType());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(5000, library.getHealthValue());
    }


    @Test
    public void canTakeDamage(){
        library.takeDamage(tank.getAttackValue());
        assertEquals(3000, library.getHealthValue());
    }


}
