import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Flight flight1;
    Plane plane;

    @Before
    public void before() {

        passenger1 = new Passenger("Steve", 1);
        plane = new Plane(PlaneType.SKYTUTUT);
        flight1 = new Flight(plane, "F3456", Airport.EDI, Airport.GLA, "1400");
    }

    @Test
    public void hasName() {
        assertEquals("Steve", passenger1.getName());
    }

    @Test
    public void hasNoOfBags() {
        assertEquals(1, passenger1.getNoOfBags());
    }

    @Test
    public void isNotOnFlightAtStart() {
        assertEquals( null, passenger1.isOnFlight());
    }
}


