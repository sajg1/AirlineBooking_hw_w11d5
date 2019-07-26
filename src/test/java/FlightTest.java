import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.AIRBUSA380);
        flight = new Flight(plane, "F3456", Airport.EDI, Airport.NYC, "1400");
    }

    @Test
    public void hasPlane() {

        assertEquals(PlaneType.AIRBUSA380, flight.getPlane());
    }

    @Test
    public void hasAPlaneCapacity() {

        assertEquals(100, flight.getPlaneCapacity());
    }

    @Test
    public void hasFlightNo() {

        assertEquals("F3456", flight.getFlightNo());
    }

    @Test
    public void hasADepartureAirport() {

        assertEquals(Airport.EDI, flight.getDepAirport());
    }

    @Test
    public void hasArrivalAirport() {

        assertEquals(Airport.NYC, flight.getArrAirport());
    }

    @Test
    public void hasDepartureTime() {

        assertEquals("1400", flight.getDepTime());
    }

    @Test
    public void passengerListStartsEmpty() {

        assertEquals(0, flight.passengerCount());
    }
}
