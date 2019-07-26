import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;

    @Before
    public void before() {
        passenger1 = new Passenger("Steve", 1);
    }

    @Test
    public void hasName() {
        assertEquals("Steve", passenger1.getName());
    }

    @Test
    public void hasNoOfBags() {
        assertEquals(1, passenger1.getNoOfBags());
    }
}
